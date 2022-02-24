package Travel;

import exception.NullParameterException;

import java.util.Date;
import java.util.Objects;
import java.util.UUID;

public class PassengerFlight implements Flight {
    private Airline airline;
    private Airport origin;
    private Airport destination;
    private UUID flightNumber2;
    private Date departureTime;

    public PassengerFlight(Airline airline, Airport origin, Airport destination) throws NullParameterException {
        setAirline(airline);
        setOrigin(origin);
        setDestination(destination);
        setFlightNumber();
        setDepartureTime();
    }
    private void setFlightNumber() {
        this.flightNumber2 = UUID.randomUUID();
    }

    private void setDepartureTime() {
        this.departureTime = new Date(2022, 05, 05, 14, 30);
    }

    private void setDestination(Airport destination) throws NullParameterException {
        if (destination == null) {
            throw new NullParameterException("Destination cannot be null.");
        }
        this.destination = destination;
    }

    private void setOrigin(Airport origin) throws NullParameterException {
        if (origin.equals(null)) {
            throw new NullParameterException("Origin cannot be null.");
        }
        this.origin = origin;
    }

    private void setAirline(Airline airline) throws NullParameterException {
        if (airline.equals(null)) {
            throw new NullParameterException(("Airline cannot be null"));
        }
        this.airline = airline;
    }

    public String getAirline() {
        return airline.toString();
    }

    public String getOrigin() {
        return origin.toString();
    }

    public String getDestination() {
        return destination.toString();
    }



    public String getFlightNumber() {
        return flightNumber2.toString();
    }

    public String getDepartureTime() {
        return departureTime.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PassengerFlight PassengerFlight = (PassengerFlight) o;
        return Objects.equals(airline, PassengerFlight.airline) &&
                Objects.equals(origin, PassengerFlight.origin) &&
                Objects.equals(destination, PassengerFlight.destination) &&
                Objects.equals(flightNumber2, PassengerFlight.flightNumber2) &&
                Objects.equals(departureTime, PassengerFlight.departureTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(airline, origin, destination, flightNumber2, departureTime);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "airline=" + getAirline() +
                ", origin=" + getOrigin() +
                ", destination=" + getDestination() +
                ", flightNumber2=" + getFlightNumber() +
                ", departureTime=" + getDepartureTime() +
                '}';
    }
}