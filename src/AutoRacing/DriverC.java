package AutoRacing;

public class DriverC extends Driver<Truck>{

    public DriverC(String lastName, String name, String middleName, char category, int drivingExperience, Truck truck) throws IllegalLicenseException{
        super(lastName, name, middleName, category, drivingExperience, truck);
        if (Character.toUpperCase(category) != 'C' && Character.toUpperCase(category) != 'С') {
            throw new IllegalLicenseException(" водителю грузового автомобиля необходимо иметь категорию С !");
        }
    }

}
