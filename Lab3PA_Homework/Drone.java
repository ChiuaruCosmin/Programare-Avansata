public class Drone extends Aircraft implements CargoCapable {
    private double cargoCapacity;
    private double batteryLife;

    public Drone(String model, String tailNumber, String callSign, double cargoCapacity, double batteryLife) {
        super(model, tailNumber, callSign);
        this.cargoCapacity = cargoCapacity;
        this.batteryLife = batteryLife;
    }

    public double getBatteryLife() {
        return batteryLife;
    }

    @Override
    public double getCargoCapacity() {
        return cargoCapacity;
    }
}
