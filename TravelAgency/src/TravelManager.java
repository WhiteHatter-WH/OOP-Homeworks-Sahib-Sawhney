import Travel.*;
import exception.BadParameterException;
import exception.NullParameterException;

import java.util.Optional;

public class TravelManager {


    public static void main(String[] args) throws Exception {
        try {
            Airline airline = new Airline("United");
            Airport origin = new Airport("ORD");
            Airport destination = new Airport("JFK");

            //CommercialFlight commercialFlight = new CommercialFlight(airline, origin, destination);
            String flightNumber = FlightManager.getInstance().createFlight("commercialFlight", airline, origin, destination);
            String flightNumber2 = FlightManager.getInstance().createFlight("passengerFlight", airline, origin, destination);
            Optional<Flight> flight = FlightManager.getInstance().getFlightByFlightNumber(flightNumber);

            System.out.println(flight.get());
        } catch (NullParameterException ex) {
            ex.printStackTrace();
        } catch (BadParameterException ex) {
            ex.printStackTrace();
        }
    }

}