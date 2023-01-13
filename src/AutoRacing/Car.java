package AutoRacing;

import java.time.LocalDate;
import java.util.List;

public class Car extends Auto implements Competing {

    CarType bodyType;
    static int count;
    public static final int[] MAX_SPEED = {226, 232, 228, 237};
    public static final double[] TOP_LAP = {1.56, 1.71, 1.60, 1.75};

    public Car(String brand, String model, double engineVolume, CarType bodyType) {
        super(brand, model, engineVolume);
        this.bodyType = bodyType;
        count++;
        bestLapTime(count);
        maxSpeed(count);
    }

    //        printType(bodyType);
    public Car(String brand, String model, double engineVolume, CarType bodyType, List<AutoMechanic> autoMechanic) {
        super(brand, model, engineVolume);
        this.autoMechanic = autoMechanic;
        this.bodyType = bodyType;
        count++;
        bestLapTime(count);
        maxSpeed(count);
    }

    public void startEngine() {
        System.out.println("Запустили " + getEngineVolume() + "л двигатель автомобиля " + getBrand() + " " + getModel());
    }

    public void stopEngine() {
        System.out.println("Остановили " + getEngineVolume() + "л двигатель автомобиля " + getBrand() + " " + getModel());
    }

    @Override
    public String toString() {
        return getBrand() + " " + getModel() + " с двигаталем " + getEngineVolume() +
                " л, тип кузова - " + bodyType.getBodyType();
    }

    @Override
    public boolean pitStop() {
        return true;
    }

    public void printType(CarType type) {
        if (nullString(String.valueOf(type))) {
            System.out.println(" Данных по транспортному средству недостаточно");
        } else System.out.println("ТИП легкового ТС = " + type);
    }

    @Override
    public int maxSpeed(int i) {
//        System.out.println("Max speed of car = " +MAX_SPEED[i-1]+" km/h");
        return MAX_SPEED[i - 1];
    }

    @Override
    public double bestLapTime(int i) {
//        System.out.println("Lap top = "+TOP_LAP[i-1] +" min");
        return TOP_LAP[i - 1];
    }

    public static void goToDiagnostic(Car car) {
        System.out.println("Автомобилю " + car.getBrand() + " " + car.getModel() + " с двигаталем " + car.getEngineVolume() +
                " л нужно пройти диагностику");
    }

    @Override
    public void goToRegularService(List<AutoMechanic> autoMechanic) {
        if (autoMechanic.size() == 0) {
            System.out.println("Пройти ТО невозможно - нет доступнух механиков");
        } else {
            for (AutoMechanic mech : autoMechanic) {
                if (mech.getMechanicCategory() == MechanicCategory.CAR || mech.getMechanicCategory() == MechanicCategory.ALL_AUTO) {
                    System.out.println("Регулярный ТО автомобиля " + getBrand() + " " + getModel() + " будет проводить " + mech);
                    break;
                }
            }
        }
    }

    @Override
    public void goToRepair(List<AutoMechanic> autoMechanic) {
        int minNumMechanics = 2;   // минимальное количество механиков лдя проведения ремонта
        if (autoMechanic.size() < minNumMechanics) {
            System.out.println("Произвести ремонт невозможно - нет доступнух механиков");
        } else {
            int count = 0;
            for (AutoMechanic mech : autoMechanic) {
                if (mech.getMechanicCategory() == MechanicCategory.CAR || mech.getMechanicCategory() == MechanicCategory.ALL_AUTO)
                    count++;
                if (count >= minNumMechanics) break;
            }
            if (count < minNumMechanics) {
                System.out.println("Произвести ремонт невозможно - нет достаточного количества механиков нужной категории");
                return;
            }
// Доступные механики нужной категории есть в достаточном количестве, незовем их:
            System.out.println("Ремонтировать автомобиль " + getBrand() + " " + getModel() + " будут: ");
            for (AutoMechanic mech : autoMechanic) {
                count = 1;
                if (mech.getMechanicCategory() == MechanicCategory.CAR || mech.getMechanicCategory() == MechanicCategory.ALL_AUTO) {
                    System.out.println(mech);
                    count++;
                    if (count > minNumMechanics) break;
                }
            }
        }
    }
}
