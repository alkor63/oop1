package AutoRacing;

public class DriverB extends Driver<Car> {
    public DriverB(String lastName, String name, String middleName, char category, int drivingExperience, Car car) throws IllegalLicenseException {
        super(lastName, name, middleName, category, drivingExperience, car);
        if (Character.toUpperCase(category) != 'B' && Character.toUpperCase(category) != 'В') {
            throw new IllegalLicenseException(" водителю легкового автомобиля необходимо иметь категорию В!");
        }
    }
}
