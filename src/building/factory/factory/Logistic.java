package building.factory.factory;

import building.factory.product.Transport;

public abstract class Logistic {

    public abstract Transport createTransport();

    public void doSomething() {
        System.out.println("Logic embedded in the factory method");
    };
}
