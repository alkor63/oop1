package AutoRacing;

import java.util.Objects;

public class AutoMechanic {
    private String mechanicName;
    private String firma;
    private final MechanicCategory mechanicCategory;

    public AutoMechanic(String mechanicName, String firma, MechanicCategory mechanicCategory) {
        if (mechanicName == null || mechanicName.isEmpty() || mechanicName.isBlank())
            mechanicName = "имя механика не известно";
        this.mechanicName = mechanicName;
        if (firma == null || firma.isEmpty() || firma.isBlank())
            firma = "Неизвестная автомастерская";
        this.firma = firma;
        this.mechanicCategory = mechanicCategory;
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

    public MechanicCategory getMechanicCategory() {
        return mechanicCategory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AutoMechanic that = (AutoMechanic) o;
        return Objects.equals(mechanicName, that.mechanicName) && Objects.equals(firma, that.firma) && mechanicCategory == that.mechanicCategory;
    }

    @Override
    public int hashCode() {
        return Objects.hash(mechanicName, firma, mechanicCategory);
    }

    @Override
    public String toString() {
        return " автомеханик " + mechanicName + " (фирма " + firma + "), категория " + mechanicCategory +
                '}';
    }
}

