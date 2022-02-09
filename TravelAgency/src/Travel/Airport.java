package Travel;

import exception.BadParameterException;
import exception.NullParameterException;

import java.util.Objects;

public class Airport {
    private String airportName;

    public Airport(String airportName) throws BadParameterException, NullParameterException {
        setAirportName(airportName);
    }

    private void setAirportName(String aName) throws NullParameterException, BadParameterException {
        if (aName == null) {
            throw new NullParameterException("Null value passed in for setAirportName");
        }
        if (aName.length() != 3 || !aName.equals(aName.toUpperCase())) {
            throw new BadParameterException("Bad value passed to setAirportName: " + aName);
        }
        airportName = aName;
    }


    public String getAirportName() {

        return airportName;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "airportName='" + getAirportName() + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airport airport = (Airport) o;
        return airportName.equals(airport.airportName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(airportName);
    }
}
