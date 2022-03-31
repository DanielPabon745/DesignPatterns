package building.abstractfactory.factory.concrete;

import building.abstractfactory.factory.FurnitureAbstractFactory;
import building.abstractfactory.product.Chair;
import building.abstractfactory.product.Couch;
import building.abstractfactory.product.concrete.VictorianChair;
import building.abstractfactory.product.concrete.VictorianCouch;

public class VictorianFurnitureFactory implements FurnitureAbstractFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Couch createCouch() {
        return new VictorianCouch();
    }
}
