package AutoRacing;
public class Truck extends Auto implements Competing {
    TruckType truckType;
    static int count;
    public static final int[] MAX_SPEED = {126, 132, 128, 137};
    public static final double[] TOP_LAP = {2.16, 2.11, 2.30, 2.25};



    public Truck(String brand, String model, double engineVolume, TruckType truckType) {
        super(brand, model, engineVolume);
        this.truckType = truckType;
        count++;
        bestLapTime(count);
        maxSpeed(count);
    }


    public void startEngine() {
        System.out.println("Запустили " + getEngineVolume() + "л двигатель грузовика " + getBrand() + " " + getModel());
    }

    public void stopEngine() {
        System.out.println("Остановили " + getEngineVolume() + "л двигатель грузовика " + getBrand() + " " + getModel());
    }

    @Override
    public String toString() {
        return "грузовик " + getBrand() + " " + getModel() + " с двигаталем " + getEngineVolume() +
                " л. Грузоподъемность" + truckType.getTonnage();
    }

    @Override
    public boolean pitStop() {
        return true;
    }

    @Override
    public double bestLapTime(int count) {
//        System.out.println("Lap top = " + TOP_LAP[count - 1] + " min");
        return TOP_LAP[count - 1];
    }

    @Override
    public int maxSpeed(int count) {
//        System.out.println("Max speed of truck = " + MAX_SPEED[count - 1] + " km/h");
        return MAX_SPEED[count - 1];
    }
}
