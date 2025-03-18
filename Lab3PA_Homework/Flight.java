import java.time.LocalTime;

public class Flight {
    private String flightId;
    private Aircraft aircraft;
    private LocalTime landingStart;
    private LocalTime landingEnd;
    private int assignedRunway;

    public Flight(String flightId, Aircraft aircraft, LocalTime landingStart, LocalTime landingEnd) {
        this.flightId = flightId;
        this.aircraft = aircraft;
        this.landingStart = landingStart;
        this.landingEnd = landingEnd;
        this.assignedRunway = -1;
    }

    public String getFlightId() {
        return flightId;
    }

    public LocalTime getLandingStart() {
        return landingStart;
    }

    public LocalTime getLandingEnd() {
        return landingEnd;
    }

    public int getAssignedRunway() {
        return assignedRunway;
    }

    public void setAssignedRunway(int runway) {
        this.assignedRunway = runway;
    }

    public boolean conflictsWith(Flight other) {
        return !(this.landingEnd.isBefore(other.landingStart) || this.landingStart.isAfter(other.landingEnd));
    }
}
