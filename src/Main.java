//import Transport.Bus;
//import Transport.Car;
//import Transport.AutoService;
import AutoRacing.Bus;
import AutoRacing.Car;
import AutoRacing.AutoService;
import AutoRacing.Truck;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Car[] cars = new Car[4];
        cars[0] = new Car("Nissan","Primera",2.0);
        cars[1] = new Car("Audi","A8 50 L TDI quattro",3.0);
        cars[2] = new Car("BMW","Z8", 3.0);
        cars[3] = new Car("Kia","Sportage", 2.4);

        for (Car car: cars)
            System.out.println(car);

        Bus[] buses = new Bus[4];
        buses[0]= new Bus("МАЗ","251",4.8);
        buses[1]= new Bus("MAN","Lion's Coach 49",5.2);
        buses[2]= new Bus("Volvo","7700",6.0);
        buses[3]= new Bus("Ikarus","386",4.6);

        for (Bus bus: buses)
            System.out.println(bus);

        Truck[] trucks = new Truck[4];
        trucks[0] = new Truck("MAZ","6440 RR",12.5);
        trucks[1] = new Truck("IVECO","Powerstar",13.0);
        trucks[2] = new Truck("Tatra","Phoenix", 12.5);
        trucks[3] = new Truck("Mercedes","Zetros", 13.0);

        for (Truck truck: trucks)
            System.out.println(truck);

// вводим данные страхового полиса
//        LocalDate polisDate = LocalDate.of(2022, 11, 28);
//        Car.Insurance carIns = new Car.Insurance(polisDate, 5678.5, "78GFR876TFC");
//        AutoService.checkInsNumber(carIns.getNumIns());
//        System.out.println("Текущая дата : "+LocalDate.now());
    }
}