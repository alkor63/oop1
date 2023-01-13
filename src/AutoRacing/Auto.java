package AutoRacing;

import java.util.List;

public abstract class Auto {

    private final String brand;
    private final String model;
    private double engineVolume;

    List<AutoMechanic> autoMechanic;
    public Auto(String brand, String model, double engineVolume) {

        if (nullString(brand)) brand = "default brand";
        if (nullString(model)) model = "default model";

        this.brand = brand;
        this.model = model;
        setEngineVolume(engineVolume);
    }
    public Auto(String brand, String model, double engineVolume, List<AutoMechanic> autoMechanic) {

        if (nullString(brand)) brand = "default brand";
        if (nullString(model)) model = "default model";

        this.brand = brand;
        this.model = model;
        setEngineVolume(engineVolume);
        this.autoMechanic = autoMechanic;
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
    public void printType(){}
    public void goToDiagnostic(){}



public abstract void goToRegularService(List<AutoMechanic> autoMechanic);
// У нас для регулярного ТО достаточно 1 механика

public abstract void goToRepair(List<AutoMechanic> autoMechanic);
// У нас для регмонта авто нужно 2 механика
}
