package AutoRacing;

import static AutoRacing.Auto.nullString;

public enum BusType {
    EXRTA_SMALL(null, 10),
    SMALL(0, 25),
    MEDIUM(40, 50),
    LARGE(60, 80),
    EXRTA_LARGE(100, 120);

    private Integer capacityFrom;
    private Integer capacityTo;

    BusType(Integer capacityFrom, Integer capacityTo) {
        if (capacityFrom == null) capacityFrom = 0;
        this.capacityFrom = capacityFrom;
        this.capacityTo = capacityTo;
    }

    public String getCapacity() {
        String capacity;
        if (nullString(Integer.toString(capacityFrom)) || capacityFrom == 0) {
            capacity = " до " + capacityTo + " мест";
        } else capacity = " " + capacityFrom + "-" + capacityTo + " мест";
        return capacity;
    }
}
