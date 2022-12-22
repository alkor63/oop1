package AutoRacing;

import java.time.LocalDate;

public class Car extends Auto {

    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }
    public void startEngine(){
        System.out.println("Запустили "+getEngineVolume()+"л двигатель автомобиля "+getBrand()+" "+getModel());
    }
    public void stopEngine(){
        System.out.println("Остановили "+getEngineVolume()+"л двигатель автомобиля "+getBrand()+" "+getModel());
    }

    @Override
    public String toString() {
        return "Racing легковой автомобиль "+getBrand()+" "+getModel()+" с двигаталем "+getEngineVolume()+" л";
    }
}
