package AutoRacing;

import java.time.LocalDate;

public class Car extends Auto {

    private double engineVolume;
    private String transmission;
    private final String bodyType;
    private String regNumber;
    private final int numberOfSeats;
    private boolean summerTires;
    private Auto.Car.Insurance insurance;
    private Auto.Car.Key key;

    public static class Insurance {
        private LocalDate validityPeriod;
        private final double costIns;
        private final String numIns;

        public Insurance(LocalDate validityPeriod, double costIns, String numIns) {
            if (AutoService.insDateOK(validityPeriod)) this.validityPeriod = validityPeriod;
            if (costIns < 0) costIns = -1 * costIns;
            this.costIns = costIns;
            if (nullString(numIns)) numIns = "номпен полиса не указан";
            this.numIns = numIns;
        }

        public LocalDate getValidityPeriod() {
            return validityPeriod;
        }

        public double getCostIns() {
            return costIns;
        }

        public String getNumIns() {
            return numIns;
        }
    }

    public static class Key {
        private boolean remoteEngineStart;
        private boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }

        // геттеры для boolean выглядят так:
        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }

    }

    public Car(String brand, String model, int year, String country, String color, int maxSpeed, double engineVolume,
               String transmission, String bodyType, String regNumber, int numberOfSeats) {
        super(brand, model, year, country, color, maxSpeed);
        if (engineVolume <= 0) engineVolume = 1.5;
        if (numberOfSeats <= 0) numberOfSeats = 5;
        if (nullString(transmission)) transmission = "не указан";
        if (nullString(bodyType)) bodyType = "не указан";
        if (nullString(regNumber)) regNumber = "не указан";

        this.engineVolume = engineVolume;
        this.transmission = transmission;
        this.bodyType = bodyType;
        this.regNumber = regNumber;
        this.numberOfSeats = numberOfSeats;
    }


    @Override
    public String toString() {
        return "Автомобиль " + getBrand() + " " + getModel() + ", " + getYear() +
                " год выауска, страна сборки " + getCountry() +
                ", цвет " + getColor() + ", объем двигателя " + engineVolume + " л\n\t\t\t" +
                "КП - " + transmission + ", " + numberOfSeats + "-местный " + bodyType + " рег.номер " + regNumber;

    }



    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public boolean isSummerTires() {
        return summerTires;
    }

    public void setSummerTires(boolean summerTires) {
        this.summerTires = summerTires;
    }

}
