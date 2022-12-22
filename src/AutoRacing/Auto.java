package AutoRacing;

public class Auto {

    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    private String color;
    private int maxSpeed;

    public Auto(String brand, String model, int year, String country, String color, int maxSpeed) {
        if (year <= 0) year = 2000;
        if (nullString(color)) color = "белый";
        if (nullString(brand)) brand = "default brand";
        if (nullString(model)) model = "default model";
        if (nullString(country)) country = "default country";
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.country = country;
        this.color = color;
        setMaxSpeed(maxSpeed);
    }

    public Auto(String brand, String model, int year, String country) {
        this(brand,model,year,country,"white",0);

    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed < 0) maxSpeed = -1 * maxSpeed;
        this.maxSpeed = maxSpeed;
    }
    public static boolean nullString(String s) {
        return (s == null || s.isEmpty());
    }

}
