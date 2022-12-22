package AutoRacing;

public class Truck extends Auto{
    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }
    public void startEngine(){
        System.out.println("Запустили "+getEngineVolume()+"л двигатель грузовика "+getBrand()+" "+getModel());
    }
    public void stopEngine(){
        System.out.println("Остановили "+getEngineVolume()+"л двигатель грузовика "+getBrand()+" "+getModel());
    }
    @Override
    public String toString() {
        return "Racing грузовик "+getBrand()+" "+getModel()+" с двигаталем "+getEngineVolume()+" л";
    }
}
