package AutoRacing;

import java.util.List;

public class Bus extends Auto implements Competing {
    BusType busType;
    static int count;
    public static final int[] MAX_SPEED = {96, 92, 98, 97, 111};
    public static final double[] TOP_LAP = {3.16, 3.11, 3.30, 3.25, 2.99};

    public Bus(String brand, String model, double engineVolume, BusType busType) {
        super(brand, model, engineVolume);
        this.busType = busType;
        count++;
        bestLapTime(count);
        maxSpeed(count);
//        printType(busType);
    }

    public Bus(String brand, String model, double engineVolume, BusType busType, List<AutoMechanic> autoMechanic) {
        super(brand, model, engineVolume);
        this.busType = busType;
        this.autoMechanic = autoMechanic;
        count++;
        bestLapTime(count);
        maxSpeed(count);
    }

    public void startEngine() {
        System.out.println("Запустили " + getEngineVolume() + "л двигатель автобуса " + getBrand() + " " + getModel());
    }

    public void stopEngine() {
        System.out.println("Остановили " + getEngineVolume() + "л двигатель автобуса " + getBrand() + " " + getModel());
    }

    @Override
    public String toString() {
        return "автобус " + getBrand() + " " + getModel() + " с двигаталем " + getEngineVolume() +
                " л, вместимость " + busType.getCapacity();
    }

    @Override
    public boolean pitStop() {
        return false;
    }

    @Override
    public int maxSpeed(int i) {
//        System.out.println("Max speed of bus = " +MAX_SPEED[i-1]+" km/h");
        return MAX_SPEED[i - 1];
    }

    @Override
    public double bestLapTime(int i) {
//        System.out.println("Lap top = "+TOP_LAP[i-1] +" min");
        return TOP_LAP[i - 1];
    }

    public void printType(BusType type) {
        if (nullString(String.valueOf(type))) {
            System.out.println(" Данных по транспортному средству недостаточно");
        } else System.out.println("ТИП ТС = " + type);
    }

    public void goToDiagnostic(Bus bus) {
        throw new RuntimeException("Автобусы НЕ могут проходить диагностику!!!");
    }
/*
    @Override
    public void addMechanicTeamRacing(List<Mechanic> mechanics) {
        System.out.println ("Автобус " + getBrand() + " " + getModel() + ", объем двигателя " + getEngineVolume());
        for (Mechanic value : mechanic)
        { if (value.getVehicleRepairSpecification () == VehicleRepairSpecification.SPECIFICATION_BUS||value.getVehicleRepairSpecification () == VehicleRepairSpecification.SPECIFICATION_UNIVERSAL)
        {System.out.println ( "- обслуживает " + value);}
        }
    }


    @Override
    public void doRegularService(List<Mechanic> mechanics) {
        System.out.println ("Механики :");
        for (Mechanic value : mechanic)
        { if (value.getVehicleRepairSpecification () == VehicleRepairSpecification.SPECIFICATION_CAR||value.getVehicleRepairSpecification () == VehicleRepairSpecification.SPECIFICATION_UNIVERSAL)
        {System.out.println ( "- " + value);}
        }
        System.out.println ("производят регулярное ТО на автомобиле " + getBrand ()+" "+getModel ());
    }
 */

    @Override
    public void goToRegularService(List<AutoMechanic> autoMechanic) {
        if (autoMechanic.size() == 0) {
            System.out.println("Пройти ТО невозможно - нет доступнух механиков");
        } else {
            for (AutoMechanic mech : autoMechanic) {
                if (mech.getMechanicCategory() == MechanicCategory.BUS || mech.getMechanicCategory() == MechanicCategory.ALL_AUTO) {
                    System.out.println("Регулярный ТО автобуса " + getBrand() + " " + getModel() + " будет проводить " + mech);
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
                if (mech.getMechanicCategory() == MechanicCategory.BUS || mech.getMechanicCategory() == MechanicCategory.ALL_AUTO)
                    count++;
                if (count >= minNumMechanics) break;
            }
            if (count < minNumMechanics) {
                System.out.println("Произвести ремонт невозможно - нет достаточного количества механиков нужной категории");
                return;
            }
// Доступные механики нужной категории есть в достаточном количестве, незовем их:
            System.out.println("Ремонтировать автобус " + getBrand() + " " + getModel() + " будут: ");
            for (AutoMechanic mech : autoMechanic) {
                count = 1;
                if (mech.getMechanicCategory() == MechanicCategory.BUS || mech.getMechanicCategory() == MechanicCategory.ALL_AUTO) {
                    System.out.println(mech);
                    count++;
                    if (count > minNumMechanics) break;
                    }
            }
        }
    }
}
