package AutoRacing;

public class Auto {

    private final String brand;
    private final String model;
    private double engineVolume;


    public Auto(String brand, String model, double engineVolume) {

        if (nullString(brand)) brand = "default brand";
        if (nullString(model)) model = "default model";
        this.brand = brand;
        this.model = model;
        setEngineVolume(engineVolume);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }


    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume < 0) engineVolume = -1 * engineVolume;
        this.engineVolume = engineVolume;
    }
    public static boolean nullString(String s) {
        return (s == null || s.isEmpty());
    }
    public void startEngine(){}
    public void stopEngine(){}

}
