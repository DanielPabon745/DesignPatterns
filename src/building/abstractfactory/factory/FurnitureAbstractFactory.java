package building.abstractfactory.factory;

import building.abstractfactory.product.Chair;
import building.abstractfactory.product.Couch;

public interface FurnitureAbstractFactory {

    Chair createChair();

    Couch createCouch();

}
