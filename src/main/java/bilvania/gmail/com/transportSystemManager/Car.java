package bilvania.gmail.com.transportSystemManager;

public class Car extends Transport{
    private double engineVolume;

    public Car(String model, int year, double engineVolume) {
        super(model, year);
        this.engineVolume = engineVolume;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    @Override
    public double getFuelConsumption() {
        return engineVolume*0.01;
    }

    @Override
    public void start() {
        System.out.println("Starting Car");
    }

    @Override
    public void stop() {
        System.out.println("Car has been stopped");
    }

    @Override
    public double getMaxSpeed() {
        return 180;
    }
}
