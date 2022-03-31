package building.abstractfactory.product.concrete;

import building.abstractfactory.product.Couch;

public class ModernCouch implements Couch {
    @Override
    public int pillowCount() {
        return 5;
    }

    @Override
    public boolean isComfortable() {
        return true;
    }
}
