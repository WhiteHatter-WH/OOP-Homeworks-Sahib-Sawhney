package Travel;

import exception.NullParameterException;

public class FlightFactory implements Flight {

    public CommercialFlight createFlight(String flight) throws NullParameterException {
        if (flight.equals("CommercialFlight"))
            return new CommercialFlight();
        else return null;
    }

    @Override
    public void createFlight() {

    }

    @Override
    public void ab2() {

    }

    @Override
    public void ab1() {

    }
}
