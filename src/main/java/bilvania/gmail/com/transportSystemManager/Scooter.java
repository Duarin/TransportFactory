package bilvania.gmail.com.transportSystemManager;

public class Scooter extends Transport {

    double exhaustAmount;

    public Scooter(String model, int year, double exhaustAmount) {
        super(model, year);
        this.exhaustAmount = exhaustAmount;
    }

    @Override
    public double getFuelConsumption() {
        return 0;
    }

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
