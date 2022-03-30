package building.factory.factory.creator;

import building.factory.factory.Logistic;
import building.factory.product.Transport;
import building.factory.product.impl.AirTransportation;

public class AirTransportationCreator extends Logistic {

    @Override
    public Transport createTransport() {
        return new AirTransportation();
    }
}
