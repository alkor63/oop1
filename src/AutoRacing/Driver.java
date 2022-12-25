package AutoRacing;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;
@Getter
@Setter

public class Driver <T extends Auto> {
    private String lastName;
    private String name;
    private String middleName;
    private boolean license;
    private int drivingExperience;
    private T vehicle;

    public Driver(String lastName, String name, String middleName, int drivingExperience, T vehicle) {
        this.lastName = lastName;
        this.name = name;
        this.middleName = middleName;
        this.drivingExperience = drivingExperience;
        this.vehicle = vehicle;
    }

    public static void startMoving(){};
    private static void stopMoving(){};
    private static void refuel(){};

    @Override
    public String toString() {
        return "Водитель " + lastName +" "+ name+" "+middleName+" управляет автомобилем " +  vehicle +" и будет участвовать в заезде";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver<?> driver = (Driver<?>) o;
        return Objects.equals(lastName, driver.lastName) && Objects.equals(name, driver.name) && Objects.equals(middleName, driver.middleName) && Objects.equals(vehicle, driver.vehicle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, name, middleName, vehicle);
    }
}
