package AutoRacing;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AutoMechanic {
    private String mechanicName;
    private String firma;
    private final List<Class<? extends Auto>> carTypes = new ArrayList<>();

    public AutoMechanic(String mechanicName, String firma) {
        if (mechanicName == null || mechanicName.isEmpty() || mechanicName.isBlank())
            mechanicName = "имя механика не известно";
        this.mechanicName = mechanicName;
        if (firma == null || firma.isEmpty() || firma.isBlank())
            firma = "Неизвестная автомастерская";
        this.firma = firma;
    }

    public String getMechanicName() {
        return mechanicName;
    }

    public void setMechanicName(String mechanicName) {
        if (mechanicName == null || mechanicName.isEmpty() || mechanicName.isBlank()) {
            System.out.println("Заполните поле mechanicName !!!");
            mechanicName = "имя механика не известно";
        }
        this.mechanicName = mechanicName;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        if (firma == null || firma.isEmpty() || firma.isBlank()) {
            System.out.println("Заполните поле firma (автомастерская) !!!");
            firma = "Неизвестная автомастерская";
        }
        this.firma = firma;
    }

    public List<Class<? extends Auto>> getCarTypes() {
        return carTypes;
    }

    public void addCarType(Class<? extends Auto> carType) {
        this.carTypes.add(carType);
    }
    public void doService(Auto auto){
        if (this.carTypes.contains(auto.getClass())) {
            System.out.format("Проводим ТО автомобиля %s %s (class %s)%n",
            auto.getBrand(), auto.getModel(), auto.getClass().getSimpleName());
        }
        else {
            System.out.format("!!! Механик %S (фирма %S) не обслуживает автомобили категории %s%n",
                    mechanicName,firma,auto.getClass().getSimpleName());
        }
    }
    public void doRepair(Auto auto){
        if (this.carTypes.contains(auto.getClass())) {
            System.out.format("Проводим ремонт автомобиля %s %s (class %s)%n",
                    auto.getBrand(), auto.getModel(), auto.getClass().getSimpleName());
        }
        else {
            System.out.format("!!! Механик %S (фирма %S) не может ремонтировать автомобили категории %s%n",
                    mechanicName,firma,auto.getClass().getSimpleName());
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AutoMechanic that = (AutoMechanic) o;
        return Objects.equals(mechanicName, that.mechanicName) && Objects.equals(firma, that.firma);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mechanicName, firma);
    }

    @Override
    public String toString() {
        return " автомеханик " + mechanicName + " (фирма " + firma + ")";
    }
}

