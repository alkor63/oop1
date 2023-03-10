package AutoRacing;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Auto {

    private final String brand;
    private final String model;
    private double engineVolume;
private Driver driver;

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    private List<AutoMechanic> thisAutoMechanics = new ArrayList<>();


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
    public List<AutoMechanic> getThisAutoMechanics() {
        return thisAutoMechanics;
    }

    public void setThisAutoMechanics(AutoMechanic autoMechanic) {
        this.thisAutoMechanics.add(autoMechanic);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auto auto = (Auto) o;
        return Double.compare(auto.engineVolume, engineVolume) == 0 && Objects.equals(brand, auto.brand) && Objects.equals(model, auto.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume);
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

// public abstract void goToRegularService(List<AutoMechanic> autoMechanic);
// ?? ?????? ?????? ?????????????????????? ???? ???????????????????? 1 ????????????????

// public abstract void goToRepair(List<AutoMechanic> autoMechanic);
// ?? ?????? ?????? ???????????????? ???????? ?????????? 2 ????????????????
    }
