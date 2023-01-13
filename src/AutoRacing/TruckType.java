package AutoRacing;


import static AutoRacing.Auto.nullString;

public enum TruckType {

    N1(0f, 3.5f),
    N2(3.5f, 12f),
    N3(12f, null);

    private final Float tonnageFrom;
    private final Float tonnageTo;


    TruckType(Float tonnageFrom, Float tonnageTo) {
        if (tonnageFrom == null) tonnageFrom = 0f;
        this.tonnageFrom = tonnageFrom;
        if (tonnageTo == null) tonnageTo = 0f;
        this.tonnageTo = tonnageTo;
    }

    public String getTonnage() {
        String tonnage;
        if (nullString(Float.toString(tonnageFrom)) || tonnageFrom == 0) {
            tonnage = " до " + tonnageTo + " тонн";
            return tonnage;
        } else if (nullString(tonnageTo.toString()) || tonnageTo == 0) {
            tonnage = " свыше " + tonnageFrom + " тонн";
            return tonnage;
        } else tonnage = " свыше " + tonnageFrom + " до " + tonnageTo + " тонн";
        return tonnage;
    }
}

