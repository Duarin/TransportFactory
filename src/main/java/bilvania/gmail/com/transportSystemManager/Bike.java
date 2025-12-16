package bilvania.gmail.com.transportSystemManager;

public class Bike extends Transport {
    boolean passengerSeat;

    public Bike(String model, int year, boolean passengerSeat) {
        super(model, year);
        this.passengerSeat = passengerSeat;
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
