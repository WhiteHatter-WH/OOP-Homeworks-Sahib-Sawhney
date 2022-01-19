import Travel.Airline;
import Travel.Airport;
import Travel.Flight;
import exception.BadParameterException;
import exception.NullParameterException;

public class TravelManager{
    public static void main(String[] args) throws NullParameterException, BadParameterException {

        Airline airline = new Airline("Etihad");
        Airport airport = new Airport("ORD");
        Flight flight = new Flight("etihad", "ORD", "JFK", "", "");
    }
}
