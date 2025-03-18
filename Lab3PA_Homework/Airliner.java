public class Airliner extends Aircraft implements PassengerCapable {
    private int passengerCapacity;
    private double wingSpan;

    public Airliner(String model, String tailNumber, String callSign, int passengerCapacity, double wingSpan) {
        super(model, tailNumber, callSign);
        this.passengerCapacity = passengerCapacity;
        this.wingSpan = wingSpan;
    }

    public double getWingSpan() {
        return wingSpan;
    }

    @Override
    public int getPassengerCapacity() {
        return passengerCapacity;
    }
}
