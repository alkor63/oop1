//import Transport.Bus;
//import Transport.Car;
//import Transport.AutoService;

import AutoRacing.*;

import java.util.*;

import static AutoRacing.AutoService.*;

// import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws IllegalLicenseException {

        //    наши автомеханики:

        AutoMechanic[] autoMechanics = new AutoMechanic[4];
        autoMechanics[3] = new AutoMechanic("Кулибин", "Всё починим");
        autoMechanics[1] = new AutoMechanic("Карский", "Car Service");
        autoMechanics[2] = new AutoMechanic("Трактенберг", "Truck Service");
        autoMechanics[0] = new AutoMechanic("Басов", "Bus Service");
        List<AutoMechanic> mechanics = new ArrayList<>(Arrays.asList(autoMechanics));
        for (AutoMechanic mechanic : autoMechanics) {
//            System.out.println(mechanic);
            mechanics.add(mechanic);
        }

        List<Auto> autos = new ArrayList<>();
        Car[] cars = new Car[4];
        cars[0] = new Car("Nissan", "Primera", 2.0, CarType.PICKUP);
        cars[1] = new Car("Audi", "A8 50 L TDI quattro", 3.0, CarType.SEDAN);
        cars[2] = new Car("BMW", "Z8", 3.0, CarType.COUPE);
        cars[3] = new Car("Kia", "Sportage", 2.4, CarType.HATCHBACK);

        for (Car car : cars) {
 //           System.out.println(car);
            autos.add(car);
        }

        Truck[] trucks = new Truck[4];
        trucks[0] = new Truck("MAZ", "6440 RR", 12.5, TruckType.N2);
        trucks[1] = new Truck("Mercedes", "Zetros", 13.0, TruckType.N1);
//        trucks[1] = new Truck("Tatra", "Phoenix", 12.5, TruckType.N2);
        trucks[2] = new Truck("Tatra", "Phoenix", 12.5, TruckType.N2);
        trucks[3] = new Truck("IVECO", "Powerstar", 13.0, TruckType.N3);

        for (Truck truck : trucks) {
//            System.out.println(truck);
            autos.add(truck);
        }

        Bus[] buses = new Bus[5];
        buses[0] = new Bus("МАЗ", "251", 4.8, BusType.SMALL);
        buses[1] = new Bus("MAN", "Lion's Coach 49", 5.2, BusType.LARGE);
        buses[2] = new Bus("Volvo", "7700", 6.0, BusType.EXRTA_LARGE);
        buses[3] = new Bus("Ikarus", "386", 4.6, BusType.MEDIUM);
        buses[4] = new Bus("GAZelle", "336", 3.6, BusType.EXRTA_SMALL);

        for (Bus bus : buses) {
//            System.out.println(bus);
            autos.add(bus);
        }
        System.out.println("   ************* в нашей конюшне " + autos.size() + " автомобилей ************* \n");
//   собрали в один список все автомобили, дальше "нанимаем" водителей

        Driver<Car> ivanov = new Driver<>("Иванов", "Степан", "Петрович", 'b', 18, cars[1]);
        Driver<Bus> petrov = new Driver<>("Петров", "Иван", "Степанич", 'd', 19, buses[2]);
        Driver<Truck> stepanov = new Driver<>("Степанов", "Петр", "Иванович", 'C', 15, trucks[0]);
        System.out.println(ivanov);
        System.out.println(petrov);
        System.out.println(stepanov);

        List<Driver> drivers = new ArrayList<>();
        DriverB[] driversB = new DriverB[4];
//   на легковых авто гоняет семья Ивановых
        driversB[0] = new DriverB("Иванов", "Артем", "Иванович", 'B', 7, cars[0]);
        driversB[1] = new DriverB("Иванов", "Сергей", "Иванович", 'B', 19, cars[1]);
        driversB[2] = new DriverB("Иванов", "Иван", "Иванович", 'B', 25, cars[2]);
        driversB[3] = new DriverB("Иванов", "Василий", "Иванович", 'B', 9, cars[3]);
// !!! duplicate !!!
//        driversB[4] = new DriverB("Иванов", "Василий", "Иванович", 'B', 9, cars[3]);
        for (DriverB dB : driversB) {
            if (!drivers.contains(dB)) drivers.add(dB);
        }

        DriverC[] driversC = new DriverC[4];
//   на грузовиках гоняет семья Степановых
        driversC[0] = new DriverC("Степанов", "Степан", "Степанич", 'C', 27, trucks[0]);
        driversC[1] = new DriverC("Степанов", "Анатолий", "Степанич", 'C', 31, trucks[1]);
        driversC[2] = new DriverC("Степанов", "Борис", "Степанич", 'C', 17, trucks[2]);
        driversC[3] = new DriverC("Степанов", "Дмитрий", "Степанич", 'C', 12, trucks[3]);
        for (DriverC dB : driversC) {
            if (!drivers.contains(dB)) drivers.add(dB);
        }
        DriverD[] driversD = new DriverD[5];
//   на автобусах гоняет семья Петровых
        driversD[0] = new DriverD("Петров", "Петр", "Петрович", 'D', 33, buses[0]);
        driversD[1] = new DriverD("Петров", "Эдуард", "Николаевич", 'D', 26, buses[1]);
        driversD[2] = new DriverD("Петров", "Арсений", "Петрович", 'D', 8, buses[2]);
        driversD[3] = new DriverD("Петров", "Алексей", "Петрович", 'D', 11, buses[3]);
        driversD[4] = new DriverD("Петров", "Илья", "Петрович", 'D', 6, buses[4]);
        for (DriverD dB : driversD) {
            if (!drivers.contains(dB)) drivers.add(dB);
        }
        System.out.println("   ************* у нас есть " + drivers.size() + " водителей нужных категорий ************* \n");
//   собрали в один список всех водителей
//    driverList.forEach ( System.out::println );

        for (int i = 0; i < autos.size(); i++) {
            autos.get(i).setDriver(drivers.get(i));
        }
        autoMechanics[0].addCarType(Bus.class);
        autoMechanics[1].addCarType(Car.class);
        autoMechanics[2].addCarType(Truck.class);
        autoMechanics[3].addCarType(Bus.class);
        autoMechanics[3].addCarType(Car.class);
        autoMechanics[3].addCarType(Truck.class);
        autoMechanics[3].doService(cars[2]);
        autoMechanics[0].doService(cars[2]);
        autoMechanics[1].doRepair(trucks[1]);
        autoMechanics[3].doRepair(trucks[0]);

        cars[0].setThisAutoMechanics(autoMechanics[1]);
        buses[0].setThisAutoMechanics(autoMechanics[3]);
        buses[0].setThisAutoMechanics(autoMechanics[0]);
        trucks[0].setThisAutoMechanics(autoMechanics[2]);

        printMechanicsInfo(cars[0]);
        printMechanicsInfo(buses[0]);
        printMechanicsInfo(trucks[0]);


/*        cars[1].goToRegularService(mechanics);
        trucks[3].goToRegularService(mechanics);
        buses[3].goToRegularService(mechanics);

        cars[3].goToRepair(mechanics);
        trucks[0].goToRepair(mechanics);
        buses[2].goToRepair(mechanics);

        autoDriverAndMechanic(2, autos, drivers, mechanics);
        autoDriverAndMechanic(5, autos, drivers, mechanics);
        autoDriverAndMechanic(12, autos, drivers, mechanics);

 */

        // проверим список на предмет водителей - двойников
        System.out.println("*** проверим списоки на предмет объектов - двойников ***");
//        checkTwin( autos );
//        checkTwin( drivers );

        System.out.println("Трансформируем список в МАР (ключ - авто, значение - механик");
        Map<Auto, AutoMechanic> mechanicMap = new HashMap<>();
        for (int i = 0; i < autos.size(); i++) {
            if (autos.get(i) == null) break;

// ******************** MAP **********************
//            mechanicMap.put(autos.get(i), autos.get(i).getAutoMechanic().get(3));
//        mechanicMap.put(trucks[1],autoMechanics[2]);
//        mechanicMap.put(buses[0],autoMechanics[0]);
//            System.out.println("В этой ячейке Мапы лежит ключ = авто " + autos.get(i) + "\n + значение = " + autos.get(i).getAutoMechanic().get(3));
        }
//  домашка к уроку 9 : Set, Iterator
        System.out.println("\n+++ домашка к уроку 9 : Set, Iterator +++");
        Set<Driver> driverSet = new HashSet<>();
        for (Driver driver : drivers) {
            driverSet.add(driver);
        }
        System.out.println("+++      в нашем Set "+driverSet.size()+" водителей     +++");
//        System.out.println("   выводим их список через Итератор :");
        Iterator<Driver> iter = driverSet.iterator();
        while (iter.hasNext()) {
            Driver next = iter.next();
//            System.out.println(next);
        }
        System.out.println("\n+++ аналогично для списка механиков +++");
        Set<AutoMechanic> mechanicSet = new HashSet<>();
        for (AutoMechanic mechanic : mechanics) {
            mechanicSet.add(mechanic);
        }
        System.out.println("+++     в нашем Set "+mechanicSet.size()+" механиков     +++");
        System.out.println("   выводим их список через Итератор :");
        Iterator<AutoMechanic> iter1 = mechanicSet.iterator();
        while (iter1.hasNext()) {
            AutoMechanic next = iter1.next();
            System.out.println(next);
        }

//        Car.goToDiagnostic(cars[2]);
//        Truck.goToDiagnostic(trucks[1]);
//        Bus.goToDiagnostic(buses[0]);
//        checkDriver(ivanov, petrov, stepanov);

// вводим данные страхового полиса
//        LocalDate polisDate = LocalDate.of(2022, 11, 28);
//        Car.Insurance carIns = new Car.Insurance(polisDate, 5678.5, "78GFR876TFC");
//        AutoService.checkInsNumber(carIns.getNumIns());
//        System.out.println("Текущая дата : "+LocalDate.now());
    }

    //   public static void whoseAuto(Auto auto, List<AutoMechanic> autoMechanic){

//    }

    public static void printMechanicsInfo(Auto auto){
        System.out.format("auto : %s %s %S %n",auto.getClass().getSimpleName(), auto.getBrand(), auto.getModel());
        System.out.format("driver : %s %n",auto.getDriver());
        System.out.println(" mechanics:");
        for (AutoMechanic mechanic : auto.getThisAutoMechanics()){
            System.out.println(mechanic);
        }
        System.out.println("+++++++++++++++++++++++++++");
    }

    public static void checkCategory(Driver driver) throws IllegalLicenseException {
        if ((driver.getCategory()) < 'B' || driver.getCategory() > 'Д') {
            throw new IllegalLicenseException(" необходимо корректно указать тип прав!");
        }
    }

    public static List checkTwin(List<?> objects) {
        int listSize = objects.size();
        System.out.println("в проверяемом списке " + listSize + " элементов");
        for (int j = 0; j < objects.size(); j++) {
             Object d = objects.get(j);
            for (int i = objects.size() - 1; i > j; i--) {
                if (d.hashCode() == objects.get(i).hashCode() && objects.get(i).equals(d)) {
                    System.out.println("!!! в списке обнаружен двойник под индексами " + i + " и " + j);
                    System.out.println("index" + j + " : " + d);
                    System.out.println("index" + i + " : " + objects.get(i));
                    System.out.println("!!! удалаям его из списка !!!");
                    objects.remove(j);
                }
            }
        }
        if (listSize == objects.size()) {
            System.out.println("*** в списке объектоа-двойников не обнаружено ***");
        } else System.out.println("*** теперь в списке " + objects.size() + " элементов ***");
        return objects;
    }
}