package bilvania.gmail.com.transportSystemManager;

abstract public class Transport  implements Moveable {
    protected String model;
    protected int year;

    public Transport(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public abstract double getFuelConsumption();

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public double getMaxSpeed() {
        return 0;
    }
}
