public class Freighter extends Aircraft implements CargoCapable {
    private double cargoCapacity;
    private double maxPayload;

    public Freighter(String model, String tailNumber, String callSign, double cargoCapacity, double maxPayload) {
        super(model, tailNumber, callSign);
        this.cargoCapacity = cargoCapacity;
        this.maxPayload = maxPayload;
    }

    public double getMaxPayload() {
        return maxPayload;
    }

    @Override
    public double getCargoCapacity() {
        return cargoCapacity;
    }
}
