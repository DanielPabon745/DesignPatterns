package building.factory;

import building.factory.factory.Logistic;
import building.factory.factory.concrete.AirTransportationLogistic;
import building.factory.factory.concrete.GroundTransportationLogistic;
import building.factory.factory.concrete.MaritimeTransportationLogistic;
import building.factory.product.Transport;

import java.util.Scanner;

public class Main {
    enum Type {
        AIR(),
        GROUND,
        SEA
    }

    /**
     * Separa el código de construcción de los productos (así se denominan los objetos creados por factory)
     * del código que hace uso del producto.
     * <p>
     * Por ejemplo, para agregar un nuevo tipo de producto, solo es necesario crear una subclase
     * creadora y sobreescribir el Factory que ya existe.
     * <p>
     * Usos:
     * <p>
     * Se usa cuando no conoces de antemano las dependencias y los tipos exactos de los objetos
     * con los que deba funcionar tu codigo.
     * <p>
     * Tambien se puede usar cuando se quiera brindar a los usuarios una manera de extender
     * sus componentes internos.
     */


    public static void main(String[] args) {
        Logistic logistic;
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome, please provide a valid transport type (AIR, GROUND, SEA), put EXIT to finish.");
        String option = sc.nextLine();
        while (!option.equals("EXIT")) {
            try {
                Type type = Type.valueOf(option);
                switch (type) {
                    case AIR -> {
                        logistic = new AirTransportationLogistic();
                        logistic.doSomething();
                        Transport airTransport = logistic.createTransport();
                        airTransport.deliver();
                    }
                    case GROUND -> {
                        logistic = new GroundTransportationLogistic();
                        logistic.doSomething();
                        Transport groundTransport = logistic.createTransport();
                        groundTransport.deliver();
                    }
                    case SEA -> {
                        logistic = new MaritimeTransportationLogistic();
                        logistic.doSomething();
                        Transport maritimeTransport = logistic.createTransport();
                        maritimeTransport.deliver();
                    }
                    default -> System.out.println("You input a not valid transport type");
                }
            } catch (IllegalArgumentException exception) {
                System.out.println("You input a not valid transport type");
            }
            System.out.println();
            System.out.println("** Please provide another transport type (AIR, GROUND, SEA), put EXIT to finish.");
            option = sc.nextLine();
        }
    }
}

