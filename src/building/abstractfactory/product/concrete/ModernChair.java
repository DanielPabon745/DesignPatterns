package building.abstractfactory.product.concrete;

import building.abstractfactory.product.Chair;

public class ModernChair implements Chair {
    @Override
    public int getLegsCount() {
        return 3;
    }

    @Override
    public void sit() {
        System.out.println("You are sited in a modern chair.");
    }
}
