package building.factory.factory.creator;

import building.factory.factory.Logistic;
import building.factory.product.Transport;
import building.factory.product.impl.MaritimeTransportation;

public class MaritimeTransportationCreator extends Logistic {
    @Override
    public Transport createTransport() {
        return new MaritimeTransportation();
    }
}
