package building.abstractfactory.factory.concrete;

import building.abstractfactory.factory.FurnitureAbstractFactory;
import building.abstractfactory.product.Chair;
import building.abstractfactory.product.Couch;
import building.abstractfactory.product.concrete.ModernChair;
import building.abstractfactory.product.concrete.ModernCouch;

public class ModernFurnitureFactory implements FurnitureAbstractFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Couch createCouch() {
        return new ModernCouch();
    }
}
