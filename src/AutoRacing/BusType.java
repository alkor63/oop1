package AutoRacing;

public enum BusType {
    EXRTA_SMALL ("до 10 мест"),
    SMALL ("до 25 мест"),
    MEDIUM ("40–50 мест"),
    LARGE ("60–80 мест"),
    EXRTA_LARGE ("100–120 мест");

    private String capacity;

    BusType(String capacity) {
        this.capacity = capacity;
    }

    public String getCapacity() {
        return capacity;
    }
}
