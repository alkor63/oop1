package AutoRacing;

public class Bus extends Auto implements Competing{
    static int count;
    public static final int[] MAX_SPEED = {96, 92, 98, 97};
    public static final double[] TOP_LAP = {3.16, 3.11, 3.30, 3.25};
    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
        count ++;
        bestLapTime(count);
        maxSpeed(count);
    }
    public void startEngine(){
        System.out.println("Запустили "+getEngineVolume()+"л двигатель автобуса "+getBrand()+" "+getModel());
    }
    public void stopEngine(){
        System.out.println("Остановили "+getEngineVolume()+"л двигатель автобуса "+getBrand()+" "+getModel());
    }
    @Override
    public String toString() {
        return "автобус "+getBrand()+" "+getModel()+" с двигаталем "+getEngineVolume()+" л";
    }

    @Override
    public boolean pitStop() {
        return false;
    }

    @Override
    public int maxSpeed(int i) {
        System.out.println("Max speed of bus = " +MAX_SPEED[i-1]+" km/h");
        return MAX_SPEED[i-1];
    }

    @Override
    public double bestLapTime(int i) {
        System.out.println("Lap top = "+TOP_LAP[i-1] +" min");
        return TOP_LAP[i-1];
    }
}
