package AutoRacing;

public class Bus extends Auto{
    public Bus(String brand, String model, int year, String country, String color, int maxSpeed) {
        super(brand, model, year, country, color, maxSpeed);
    }

    @Override
    public String toString() {
        return getColor()+" автобус "+getBrand()+" "+getModel()+" "
                +getYear()+" года, "+getCountry()+", скорость до "+getMaxSpeed()+" км/ч";
    }
}
