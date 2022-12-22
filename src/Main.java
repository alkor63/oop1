import Transport.Bus;
import Transport.Car;
import Transport.AutoService;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Car[] cars = new Car[5];
        cars[0] = new Car("Lada","Granta",2015,"Россия","желтый",110, 1.7,
                "hand","sedan","a234bb123", 4);
        cars[1] = new Car("Audi","A8 50 L TDI quattro",2020,"Германия","черный",
                250, 3.0,"auto","sedan","a234bb123", 5);
        cars[2] = new Car("BMW","Z8",2015,"Германия","черный",250, 3.0,
                "auto","sedan","a234bb123", 5);
        cars[3] = new Car("Kia","Sportage 4-го поколения",2018,"Южная Корея","красный",
                200, 2.4,"auto","sedan","a234bb123", 5);
        cars[4] = new Car("","Avante",-2016,"Южная Корея",null,160, -1.6,
                "auto","sedan","a584bb178", 5);

        for (Car car: cars)
            System.out.println(car);

        Bus[] buses = new Bus[3];
        buses[0]= new Bus("НЕФАЗ","5299-40-52",2020,"Россия","синий",80);
        buses[1]= new Bus("MAN","Lion's Coach 49",2010,"Германия","балый",130);
        buses[2]= new Bus("Volvo","7700",2018,"Швеция","красный",120);

        for (Bus bus: buses)
            System.out.println(bus);
// вводим данные страхового полиса
        LocalDate polisDate = LocalDate.of(2022, 11, 28);
        Car.Insurance carIns = new Car.Insurance(polisDate, 5678.5, "78GFR876TFC");
        AutoService.checkInsNumber(carIns.getNumIns());
        System.out.println("Текущая дата : "+LocalDate.now());
    }
}