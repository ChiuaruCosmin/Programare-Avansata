public class Aircraft implements Comparable<Aircraft> {
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

    @Override
    public int compareTo(Aircraft other) {
        return this.model.compareTo(other.model);
    }
}
