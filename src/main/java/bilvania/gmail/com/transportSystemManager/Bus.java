package bilvania.gmail.com.transportSystemManager;

public class Bus extends Transport{
    private double weight;

    public Bus(String model, int year, double weight) {
        super(model, year);
        this.weight = weight;
    }

    @Override
    public double getFuelConsumption() {
        return weight*0.02;
    }

    @Override
    public void start() {
        System.out.println("Bus started!");

    }

    @Override
    public void stop() {
        System.out.println("Bus stopped!");

    }

    @Override
    public double getMaxSpeed() {
        return 180;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
