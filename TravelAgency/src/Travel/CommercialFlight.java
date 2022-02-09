package Travel;

import exception.NullParameterException;

import java.util.Date;
import java.util.Objects;
import java.util.UUID;

public interface Flight
{
    void createFlight();
    void ab2();
    void ab1();
}
public class CommercialFlight implements Flight {

    private Airline airline;
    private Airport origin;
    private Airport destination;
    private UUID flightNumber;
    private Date departureTime;

    public CommercialFlight(Airline airline, Airport origin, Airport destination) throws NullParameterException {
        setAirline(airline);
        setOrigin(origin);
        setDestination(destination);
        setFlightNumber();
        setDepartureTime();
    }

    public CommercialFlight() {

    }

    private void setDepartureTime() {
        this.departureTime = new Date(2022, 05, 05, 13, 30);
    }

    private void setFlightNumber() {
        this.flightNumber = UUID.randomUUID();
    }

    public void setAirline(Airline airline) throws NullParameterException {
        if (airline.equals(null)) {
            throw new NullParameterException(("Airline cannot be null"));
        }
        this.airline = airline;
    }

    public void setOrigin(Airport origin) throws NullParameterException {
        if (origin.equals(null)) {
            throw new NullParameterException("Origin cannot be null.");
        }
        this.origin = origin;
    }

    private void setDestination(Airport destination) throws NullParameterException {
        if (destination == null) {
            throw new NullParameterException("Destination cannot be null.");
        }
        this.destination = destination;
    }

    public String getFlightNumber() {

        return flightNumber.toString();
    }

    public String getDepartureTime() {

        return departureTime.toString();
    }

    public String getAirline() {

        return airline.toString();
    }

    public String getDestination() {

        return destination.toString();
    }

    public String getOrigin() {

        return origin.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommercialFlight flight = (CommercialFlight) o;
        return airline.equals(flight.airline)
                && origin.equals(flight.origin)
                && destination.equals(flight.destination)
                && flightNumber.equals(flight.flightNumber)
                && departureTime.equals(flight.departureTime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(airline, origin, destination, flightNumber, departureTime);
    }

    @Override
    public String toString() {
        return "CommercialFlight{" +
                "airline=" + getAirline() +
                ", origin=" + getOrigin() +
                ", destination=" + getDestination() +
                ", flightNumber=" + getFlightNumber() +
                ", departureTime=" + getDepartureTime() +
                '}';
    }

    @Override
    public void ab1() {

    }

    @Override
    public void createFlight() {

    }

    @Override
    public void ab2() {

    }
}