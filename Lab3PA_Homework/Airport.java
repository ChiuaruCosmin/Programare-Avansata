import java.util.Arrays;

public class Airport {
    private int numRunways;
    private Flight[] flights;
    private int flightCount;

    public Airport(int numRunways, int maxFlights) {
        this.numRunways = numRunways;
        this.flights = new Flight[maxFlights];
        this.flightCount = 0;
    }

    public void addFlight(Flight flight) {
        if (flightCount < flights.length) {
            flights[flightCount++] = flight;
        }
    }

    public void scheduleFlights() {
        Arrays.sort(flights, 0, flightCount, (f1, f2) -> f1.getLandingStart().compareTo(f2.getLandingStart()));

        Flight[][] runways = new Flight[numRunways][flightCount];
        int[] runwayCounts = new int[numRunways];

        for (int i = 0; i < flightCount; i++) {
            Flight flight = flights[i];
            boolean assigned = false;

            for (int j = 0; j < numRunways; j++) {
                boolean conflict = false;
                for (int k = 0; k < runwayCounts[j]; k++) {
                    if (runways[j][k].conflictsWith(flight)) {
                        conflict = true;
                        break;
                    }
                }
                if (!conflict) {
                    flight.setAssignedRunway(j);
                    runways[j][runwayCounts[j]++] = flight;
                    assigned = true;
                    break;
                }
            }
            if (!assigned) {
                System.out.println(flight.getFlightId() + " could not be assigned a Runway.");
            }
        }
    }

    public void printSchedule() {
        for (int i = 0; i < flightCount; i++) {
            System.out.println(flights[i].getFlightId() + " -> Runway " + flights[i].getAssignedRunway());
        }
    }
}
