package Travel;

import java.util.ArrayList;
import java.util.List;

public class FlightManager implements Flight {
    private int id;
    private static FlightManager ourInstance;

        List<CommercialFlight> list = new ArrayList<>();
        @Override
    public void createFlight() {

    }
    public static FlightManager getFlightByNumber() throws Exception {
        if (ourInstance == null)

            ourInstance = new FlightManager();

        return ourInstance;
    }
    private FlightManager() {

    }

    @Override
    public void ab2() {

    }

    @Override
    public void ab1() {

    }
}
