package AutoRacing;
import java.time.LocalDate;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import AutoRacing.Auto;

public class AutoService {

//private final Queue<Auto<T>> autoQueue = new ArrayDeque<>();

/*
    public static boolean insDateOK(LocalDate insDate) {
        int numYearNow = LocalDate.now().getYear();
        int numYear = insDate.getYear();
        if (numYear < numYearNow) {
            System.out.println("Страховка просрочена!");
            return false;
        } else if (numYear == numYearNow && LocalDate.now().getDayOfYear() > insDate.getDayOfYear()) {
            System.out.println("Страховка просрочена!");
            return false;
        } else return true;
    }

    public static void checkDriver(Driver... drivers) throws IllegalLicenseException {
        for (Driver driver : drivers) {
            try {
                checkCategory(driver);
            } catch (IllegalLicenseException e) {
                System.out.println("Водителю " + driver.getName() + " " + driver.getLastName() + e.getMessage());
            }
        }
    }
*/
//    public static void checkInsNumber(String numIns){
//        if (numIns.length() != 9)
//            System.out.println(" !!! "+numIns+" - некорректный номер страховки (должно быть 9 знаков) !!!");
//    }

    public static void autoDriverAndMechanic(int number, List<Auto> autos, List<Driver> drivers, List<AutoMechanic> mechanics) {
        if (number > autos.size()) {
            System.out.println("У нас меньше, чем " + number + " автомобилей");
            return;
        }
        if (number > drivers.size()) {
            System.out.println("У " + number + "-го автомобиля пока нет водителя");
            return;
        }
        Auto auto = autos.get(number);
        Driver driver = drivers.get(number);
        char driverCategory = driver.getCategory();
        MechanicCategory mc;
        switch (driverCategory) {
            case 'B':
                mc = MechanicCategory.CAR;
                break;
            case 'C':
                mc = MechanicCategory.TRUCK;
                break;
            case 'D':
                mc = MechanicCategory.BUS;
                break;
            default:
                mc = MechanicCategory.ALL_AUTO;
                break;
        }
        System.out.print("Автомобилем " + auto.getBrand() + " " + auto.getModel() + " управляет водитель " + driver.getName() + " " + driver.getLastName() + ", а обслуживает");
        for (AutoMechanic mech : mechanics) {
            if (mech.getMechanicCategory() == mc) {
                System.out.println(mech);
            }
        }
    }
}
