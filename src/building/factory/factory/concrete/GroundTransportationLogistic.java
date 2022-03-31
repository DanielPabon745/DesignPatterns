package building.factory.factory.concrete;

import building.factory.factory.Logistic;
import building.factory.product.Transport;
import building.factory.product.concrete.GroundTransportation;

public class GroundTransportationLogistic extends Logistic {
    @Override
    public Transport createTransport() {
        return new GroundTransportation();
    }
}
