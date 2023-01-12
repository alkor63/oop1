package AutoRacing;

public class AutoMechanic {
    public String mechanicName;
    public String firma;
    MechanicCategory mechanicCategory;

    public AutoMechanic(String mechanicName, String firma, MechanicCategory mechanicCategory) {
        if (mechanicName == null || mechanicName.isEmpty() || mechanicName.isBlank())
            this.mechanicName = mechanicName;
        if (firma == null || firma.isEmpty() || firma.isBlank())
            firma = "Неизвестная автомастерская";
        this.firma = firma;
        this.mechanicCategory = mechanicCategory;
    }

}
