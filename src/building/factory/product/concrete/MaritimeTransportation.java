package building.factory.product.concrete;

import building.factory.product.Transport;

public class MaritimeTransportation implements Transport {

    @Override
    public void deliver() {
        System.out.println("I'm delivering by sea");
    }
}
