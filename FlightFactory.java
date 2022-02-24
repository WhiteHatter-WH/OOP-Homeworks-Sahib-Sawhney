package Travel;

import exception.NullParameterException;

public class FlightFactory {
    private FlightFactory() {
    }

    public static Flight createFlight(String type, Airline airline, Airport origin, Airport destination) {
        if (type.equals("commercialFlight")) {
            try {
                return new CommercialFlight(airline, origin, destination);
            } catch(NullParameterException e) {
                return null;
            }
        }
        if (type.equals("passengerFlight")) {
            try {
                return new PassengerFlight(airline, origin, destination);
            } catch(NullParameterException e) {
                return null;
            }
        }
        else return null;
    }
}
