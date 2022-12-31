//import Transport.Bus;
//import Transport.Car;
//import Transport.AutoService;

import AutoRacing.*;

// import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws IllegalLicenseException {

        Car[] cars = new Car[4];
        cars[0] = new Car("Nissan", "Primera", 2.0, CarType.PICKUP);
        cars[1] = new Car("Audi", "A8 50 L TDI quattro", 3.0, CarType.SEDAN);
        cars[2] = new Car("BMW", "Z8", 3.0, CarType.COUPE);
        cars[3] = new Car("Kia", "Sportage", 2.4, CarType.HATCHBACK);

        for (Car car : cars)
            System.out.println(car);

        Bus[] buses = new Bus[4];
        buses[0] = new Bus("МАЗ", "251", 4.8, BusType.SMALL);
        buses[1] = new Bus("MAN", "Lion's Coach 49", 5.2, BusType.LARGE);
        buses[2] = new Bus("Volvo", "7700", 6.0, BusType.EXRTA_LARGE);
        buses[3] = new Bus("Ikarus", "386", 4.6, BusType.MEDIUM);

        for (Bus bus : buses)
            System.out.println(bus);

        Truck[] trucks = new Truck[4];
        trucks[0] = new Truck("MAZ", "6440 RR", 12.5, TruckType.N2);
        trucks[1] = new Truck("IVECO", "Powerstar", 13.0, TruckType.N3);
        trucks[2] = new Truck("Tatra", "Phoenix", 12.5, TruckType.N2);
        trucks[3] = new Truck("Mercedes", "Zetros", 13.0, TruckType.N1);

        for (Truck truck : trucks)
            System.out.println(truck);

        Driver<Car> ivanov = new Driver<>("Иванов", "Иван", "Иванович", 'b', 18, cars[1]);
        Driver<Bus> petrov = new Driver<>("Петров", "Петр", "Петрович", 'd', 19, buses[2]);
        Driver<Truck> stepanov = new Driver<>("Степанов", "Степан", "Степанич", 'C', 15, trucks[0]);
        System.out.println(ivanov);
        System.out.println(petrov);
        System.out.println(stepanov);

        DriverB ivan = new DriverB("Иванов", "Иван", "Иванович", 'B', 19, cars[2]);
        DriverC petr = new DriverC("Петров", "Петр", "Петрович", ' ', 21, trucks[3]);
        DriverD stepan = new DriverD("Степанов", "Степан", "Степанич", 'A', 17, buses[1]);
        System.out.println(ivan);
        System.out.println(petr);
        System.out.println(stepan);

        Car.goToDiagnostic(cars[2]);
        Truck.goToDiagnostic(trucks[1]);
//        Bus.goToDiagnostic(buses[0]);

        checkDriver(ivan, petr, stepan);

// вводим данные страхового полиса
//        LocalDate polisDate = LocalDate.of(2022, 11, 28);
//        Car.Insurance carIns = new Car.Insurance(polisDate, 5678.5, "78GFR876TFC");
//        AutoService.checkInsNumber(carIns.getNumIns());
//        System.out.println("Текущая дата : "+LocalDate.now());
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

    public static void checkCategory(Driver driver) throws IllegalLicenseException {
        if (driver.getCategory() != 'B' && driver.getCategory() != 'C' && driver.getCategory() != 'D') {
            throw new IllegalLicenseException(" необходимо указать тип прав!");
        }
    }

}