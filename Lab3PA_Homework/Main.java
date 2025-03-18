import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Airport airport = new Airport(2, 10);

        Aircraft airliner1 = new Airliner("Airliner1", "1234", "ALNR", 180, 35.8);
        Aircraft freighter1 = new Freighter("Freighter1", "5678", "FRE", 200.0, 150.0);
        Aircraft drone1 = new Drone("Drone1", "0302", "DR", 5.0, 12.0);

        Flight f1 = new Flight("Zbor1", airliner1, LocalTime.of(10, 0), LocalTime.of(10, 30));
        Flight f2 = new Flight("Zbor2", freighter1, LocalTime.of(10, 15), LocalTime.of(10, 45));
        Flight f3 = new Flight("Zbor3", drone1, LocalTime.of(10, 50), LocalTime.of(11, 10));

        airport.addFlight(f1);
        airport.addFlight(f2);
        airport.addFlight(f3);

        airport.scheduleFlights();
        airport.printSchedule();
    }
}
