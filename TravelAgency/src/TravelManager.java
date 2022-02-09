import Travel.Airline;
import Travel.Airport;
import Travel.CommercialFlight;
import Travel.FlightManager;
import exception.BadParameterException;
import exception.NullParameterException;

public class TravelManager{

    public static void main(String[] args)  {
            try {

                FlightManager flight = FlightManager.createFlight();

                System.out.println(flight);
            } catch (Exception ex) {
                ex.printStackTrace();
            }

    }
}
