package AutoRacing;

public class DriverD extends Driver<Bus>{
    public DriverD(String lastName, String name, String middleName, char category, int drivingExperience, Bus bus) throws IllegalLicenseException{
        super(lastName, name, middleName, category, drivingExperience, bus);
            if (Character.toUpperCase(category) != 'D' && Character.toUpperCase(category) != 'Д') {
            throw new IllegalLicenseException(" водителю автобуса необходимо иметь категорию D !");
        }
    }
}
