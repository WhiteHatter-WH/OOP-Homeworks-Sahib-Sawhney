package Travel;

import exception.BadParameterException;
import exception.NullParameterException;

import java.util.Objects;

public class Airline {
    private String airlineName;

    public Airline(String airlineName) throws BadParameterException, NullParameterException {
        setAirlineName(airlineName);
    }

    private void setAirlineName(String aName) throws NullParameterException, BadParameterException {
        if (aName == null) {
            throw new NullParameterException("Airline name cannot be null.");
        }
        if (aName.length() > 8) {
            throw new BadParameterException("Invalid Name: " + aName);
        }
        airlineName = aName;
    }

    private String getAirlineName()  {
            return airlineName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airline airline = (Airline) o;
        return airlineName.equals(airline.airlineName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(airlineName);
    }

    @Override
    public String toString() {
        return "Airline{" +
                "airlineName='" + airlineName + '\'' +
                '}';
    }
}
