package AutoRacing;

import java.time.LocalDate;

public class Car extends Auto implements Competing{
    static int count;
    public static final int[] MAX_SPEED = {226, 232, 228, 237};
    public static final double[] TOP_LAP = {1.56, 1.71, 1.60, 1.75};
    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
        count ++;
        bestLapTime(count);
        maxSpeed(count);
    }
    public void startEngine(){
        System.out.println("Запустили "+getEngineVolume()+"л двигатель автомобиля "+getBrand()+" "+getModel());
    }
    public void stopEngine(){
        System.out.println("Остановили "+getEngineVolume()+"л двигатель автомобиля "+getBrand()+" "+getModel());
    }

    @Override
    public String toString() {
        return "Racing легковой автомобиль "+getBrand()+" "+getModel()+" с двигаталем "+getEngineVolume()+" л";
    }

    @Override
    public boolean pitStop() {
        return true;
    }

    @Override
    public int maxSpeed(int i) {
        System.out.println("Max speed of car = " +MAX_SPEED[i-1]+" km/h");
        return MAX_SPEED[i-1];
    }

    @Override
    public double bestLapTime(int i) {
        System.out.println("Lap top = "+TOP_LAP[i-1] +" min");
        return TOP_LAP[i-1];
    }
}
