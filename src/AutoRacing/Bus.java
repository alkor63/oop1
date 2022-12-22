package AutoRacing;

public class Bus extends Auto{
    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }
    public void startEngine(){
        System.out.println("Запустили "+getEngineVolume()+"л двигатель автобуса "+getBrand()+" "+getModel());
    }
    public void stopEngine(){
        System.out.println("Остановили "+getEngineVolume()+"л двигатель автобуса "+getBrand()+" "+getModel());
    }
    @Override
    public String toString() {
        return "Racing автобус "+getBrand()+" "+getModel()+" с двигаталем "+getEngineVolume()+" л";
    }
}
