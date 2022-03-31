package building.abstractfactory.product.concrete;

import building.abstractfactory.product.Chair;

public class VictorianChair implements Chair {
    @Override
    public int getLegsCount() {
        return 4;
    }

    @Override
    public void sit() {
        System.out.println("This is a great victorian chair.");
    }
}
