package building.abstractfactory.product.concrete;

import building.abstractfactory.product.Couch;

public class VictorianCouch implements Couch {
    @Override
    public int pillowCount() {
        return 2;
    }

    @Override
    public boolean isComfortable() {
        return false;
    }
}
