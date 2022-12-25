package AutoRacing;

import java.util.Objects;

public class Driver <A extends Auto> {
    private String lastName;
    private String name;
    private String middleName;
    private boolean license;
    private int drivingExperience;
    private A vehicle;

    public Driver(String lastName, String name, String middleName, int drivingExperience, A vehicle) {
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
        return "Driver{" +
                "Водитель " + lastName +" "+ name+" "+middleName+", опыт вождения " + drivingExperience +
                " лет, водит " +  vehicle;
    }

    @Override
public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return drivingExperience == driver.drivingExperience && Objects.equals(driverName, driver.driverName);
        }

@Override
public int hashCode(){
        return Objects.hash(driverName,drivingExperience);
        }
}
