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
        autoMechanics[3] = new AutoMechanic("Кулибин", "Всё починим", MechanicCategory.ALL_AUTO);
        autoMechanics[1] = new AutoMechanic("Карский", "Car Service", MechanicCategory.CAR);
        autoMechanics[2] = new AutoMechanic("Трактенберг", "Truck Service", MechanicCategory.TRUCK);
        autoMechanics[0] = new AutoMechanic("Басов", "Bus Service", MechanicCategory.BUS);
        List<AutoMechanic> mechanics = new ArrayList<>(Arrays.asList(autoMechanics));


        List<Auto> autos = new ArrayList<>();
        Car[] cars = new Car[4];
        cars[0] = new Car("Nissan", "Primera", 2.0, CarType.PICKUP, mechanics);
        cars[1] = new Car("Audi", "A8 50 L TDI quattro", 3.0, CarType.SEDAN, mechanics);
        cars[2] = new Car("BMW", "Z8", 3.0, CarType.COUPE, mechanics);
        cars[3] = new Car("Kia", "Sportage", 2.4, CarType.HATCHBACK, mechanics);

        for (Car car : cars) {
            System.out.println(car);
            autos.add(car);
        }

        Truck[] trucks = new Truck[4];
        trucks[0] = new Truck("MAZ", "6440 RR", 12.5, TruckType.N2, mechanics);
        trucks[1] = new Truck("Mercedes", "Zetros", 13.0, TruckType.N1, mechanics);
        trucks[2] = new Truck("Tatra", "Phoenix", 12.5, TruckType.N2, mechanics);
        trucks[3] = new Truck("IVECO", "Powerstar", 13.0, TruckType.N3, mechanics);

        for (Truck truck : trucks) {
            System.out.println(truck);
            autos.add(truck);
        }

        Bus[] buses = new Bus[5];
        buses[0] = new Bus("МАЗ", "251", 4.8, BusType.SMALL, mechanics);
        buses[1] = new Bus("MAN", "Lion's Coach 49", 5.2, BusType.LARGE, mechanics);
        buses[2] = new Bus("Volvo", "7700", 6.0, BusType.EXRTA_LARGE, mechanics);
        buses[3] = new Bus("Ikarus", "386", 4.6, BusType.MEDIUM, mechanics);
        buses[4] = new Bus("GAZelle", "336", 3.6, BusType.EXRTA_SMALL, mechanics);

        for (Bus bus : buses) {
            System.out.println(bus);
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
        for (DriverB dB : driversB) {
//            System.out.println(dB);
            drivers.add(dB);
        }

        DriverC[] driversC = new DriverC[4];
//   на грузовиках гоняет семья Степановых
        driversC[0] = new DriverC("Степанов", "Степан", "Степанич", 'C', 27, trucks[0]);
        driversC[1] = new DriverC("Степанов", "Анатолий", "Степанич", 'C', 31, trucks[1]);
        driversC[2] = new DriverC("Степанов", "Борис", "Степанич", 'C', 17, trucks[2]);
        driversC[3] = new DriverC("Степанов", "Дмитрий", "Степанич", 'C', 12, trucks[3]);
        drivers.addAll(Arrays.asList(driversC));

        DriverD[] driversD = new DriverD[5];
//   на автобусах гоняет семья Петровых
        driversD[0] = new DriverD("Петров", "Петр", "Петрович", 'D', 33, buses[0]);
        driversD[1] = new DriverD("Петров", "Эдуард", "Николаевич", 'D', 26, buses[1]);
        driversD[2] = new DriverD("Петров", "Арсений", "Петрович", 'D', 8, buses[2]);
        driversD[3] = new DriverD("Петров", "Алексей", "Петрович", 'D', 11, buses[3]);
        driversD[4] = new DriverD("Петров", "Илья", "Петрович", 'D', 6, buses[4]);
        drivers.addAll(Arrays.asList(driversD));
        System.out.println("   ************* у нас есть " + drivers.size() + " водителей нужных категорий ************* \n");
//   собрали в один список всех водителей
//    driverList.forEach ( System.out::println );

        cars[1].goToRegularService(mechanics);
        trucks[3].goToRegularService(mechanics);
        buses[3].goToRegularService(mechanics);

        cars[3].goToRepair(mechanics);
        trucks[0].goToRepair(mechanics);
        buses[2].goToRepair(mechanics);

        autoDriverAndMechanic(2, autos, drivers, mechanics);
        autoDriverAndMechanic(5, autos, drivers, mechanics);
        autoDriverAndMechanic(11, autos, drivers, mechanics);

        Map<Auto, AutoMechanic> mechanicMap = new HashMap<>();
        mechanicMap.put(cars[1],autoMechanics[1]);
        mechanicMap.put(trucks[1],autoMechanics[2]);
        mechanicMap.put(buses[0],autoMechanics[0]);
        System.out.println("В этой ячейке Мапы лежит ключ = авто "+cars[1]+" + значение = "+mechanicMap.get(cars[1]));
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


    public static void checkCategory(Driver driver) throws IllegalLicenseException {
        if ((driver.getCategory()) < 'B' || driver.getCategory() > 'Д') {
            throw new IllegalLicenseException(" необходимо корректно указать тип прав!");
        }
    }

}