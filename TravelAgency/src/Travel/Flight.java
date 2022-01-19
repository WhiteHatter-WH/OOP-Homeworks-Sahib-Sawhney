package Travel;

import java.util.Date;
import java.util.Objects;
import java.util.UUID;

public class Flight {

    private String airline;
    private String origin;
    private String destination;
    private UUID flightNumber = UUID.randomUUID();
    Date departureTime;

    public Flight(String airline, String origin, String destination, UUID flightNumber, Date departureTime) {
        setAirline(airline);
        setOrigin(origin);
        setDestination(destination);
        setFlightNumber(flightNumber);
        setDepartureTime(departureTime);
    }

    private void setDepartureTime(Date departureTime) {
    }

    private void setFlightNumber(UUID flightNumber) {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return airline.equals(flight.airline) && origin.equals(flight.origin) && destination.equals(flight.destination) && flightNumber.equals(flight.flightNumber) && departureTime.equals(flight.departureTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(airline, origin, destination, flightNumber, departureTime);
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public UUID getFlightNumber() {
        return flightNumber;
    }

    public Date getDepartureTime() {
        return departureTime;
    }
}
