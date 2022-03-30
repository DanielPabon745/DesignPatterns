package building.factory.product.impl;

import building.factory.product.Transport;

public class AirTransportation implements Transport {
    @Override
    public void deliver() {
        System.out.println("I'm delivering by air");
    }
}
