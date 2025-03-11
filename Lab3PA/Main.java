interface PassengerCapable {
    int getPassengerCapacity();
}

interface CargoCapable {
    double getCargoCapacity();
}

class Aircraft {
    protected String model;
    protected String tailNumber;
    protected String callSign;

    public Aircraft(String model, String tailNumber, String callSign) {
        this.model = model;
        this.tailNumber = tailNumber;
        this.callSign = callSign;
    }

    public String getModel() {
        return model;
    }

    public String getTailNumber() {
        return tailNumber;
    }

    public String getCallSign() {
        return callSign;
    }
}

class Airliner extends Aircraft implements PassengerCapable {
    private int passengerCapacity;
    private double wingSpan;

    public Airliner(String model, String tailNumber, String callSign, int passengerCapacity, double wingSpan) {
        super(model, tailNumber, callSign);
        this.passengerCapacity = passengerCapacity;
        this.wingSpan = wingSpan;
    }

    @Override
    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public double getWingSpan() {
        return wingSpan;
    }
}

class Freighter extends Aircraft implements CargoCapable {
    private double cargoCapacity;
    private double maxPayload;

    public Freighter(String model, String tailNumber, String callSign, double cargoCapacity, double maxPayload) {
        super(model, tailNumber, callSign);
        this.cargoCapacity = cargoCapacity;
        this.maxPayload = maxPayload;
    }

    @Override
    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public double getMaxPayload() {
        return maxPayload;
    }
}

class Drone extends Aircraft implements CargoCapable {
    private double cargoCapacity;
    private double batteryLife;

    public Drone(String model, String tailNumber, String callSign, double cargoCapacity, double batteryLife) {
        super(model, tailNumber, callSign);
        this.cargoCapacity = cargoCapacity;
        this.batteryLife = batteryLife;
    }

    @Override
    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public double getBatteryLife() {
        return batteryLife;
    }
}

public class Main {
    public static void main(String[] args) {
        Aircraft airliner1 = new Airliner("Airliner1", "12345", "AIR1", 450, 35.8);
        Aircraft freighter1 = new Freighter("Freighter1", "67890", "FR1", 230.0, 140.0);
        Aircraft drone1 = new Drone("Drone1", "03020", "D1", 5.0, 12.0);

        Aircraft[] aircraftArray = {airliner1, freighter1, drone1};

        for (Aircraft a : aircraftArray) {
            if (a instanceof CargoCapable c) {
                System.out.println(a.getModel() + " can carry " + c.getCargoCapacity() + " tons");
            }
        }

        for (Aircraft a : aircraftArray) {
            if (a instanceof PassengerCapable p) {
                System.out.println(a.getModel() + " can carry " + p.getPassengerCapacity() + " passengers");
            }
        }
    }
}