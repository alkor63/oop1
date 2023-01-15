package AutoRacing;

import java.util.List;
import java.util.Objects;

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

    public List<AutoMechanic> getAutoMechanic() {
        return autoMechanic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auto auto = (Auto) o;
        return Double.compare(auto.engineVolume, engineVolume) == 0 && Objects.equals(brand, auto.brand) && Objects.equals(model, auto.model) && Objects.equals(autoMechanic, auto.autoMechanic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, autoMechanic);
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
