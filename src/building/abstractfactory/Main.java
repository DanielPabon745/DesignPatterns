package building.abstractfactory;

import building.abstractfactory.factory.FurnitureAbstractFactory;
import building.abstractfactory.factory.concrete.ModernFurnitureFactory;
import building.abstractfactory.factory.concrete.VictorianFurnitureFactory;
import building.abstractfactory.product.Chair;
import building.abstractfactory.product.Couch;

import java.util.Scanner;

public class Main {

    /**
     * Es principalmente utilizado cuando el código deba funcionar bajo multiples familias de productos,
     * pero se requiera una libertad hacia las clases concretas de los productos.
     * <p>
     * El patrón abstract factory es más dinámico con el manejo de productos en comparación al patrón factory,
     * en este puedes definir concretes por cada familia del producto logrando que se mantenga la responsabilidad de
     * cada familia dentro del alcance de su product concrete.
     *
     * NOTA: Recordar que un producto es el objeto que se crea a traves de un factory.
     */

    public static void main(String[] args) {
        enum FurnitureType {
            MODERN, VICTORIAN
        }

        class FurnitureFactory {
            private final FurnitureAbstractFactory factory;

            public FurnitureFactory(FurnitureAbstractFactory factory) {
                this.factory = factory;
            }

            public Chair createChair() {
                return this.factory.createChair();
            }

            public Couch createCouch() {
                return this.factory.createCouch();
            }
        }

        Scanner sc = new Scanner(System.in);
        FurnitureFactory furnitureFactory;

        System.out.println("Welcome, please provide a valid furniture type (MODERN, VICTORIAN), type EXIT to finish.");
        String option = sc.nextLine();
        while (!option.equals("EXIT")) {
            FurnitureAbstractFactory abstractFactory = null;
            try {
                /**
                 * Según la parametrización del usuario será moderna o victoriana la fábrica.
                 */
                FurnitureType type = FurnitureType.valueOf(option);
                switch (type) {
                    case MODERN -> abstractFactory = new ModernFurnitureFactory();
                    case VICTORIAN -> abstractFactory = new VictorianFurnitureFactory();
                }

                /**
                 * Se da uso normal a la fábrica parametrizada, utilizando sus métodos declarados.
                 */
                furnitureFactory = new FurnitureFactory(abstractFactory);

                Chair chair = furnitureFactory.createChair();
                Couch couch = furnitureFactory.createCouch();

                System.out.printf("Modern chair has %d legs. %n", chair.getLegsCount());
                System.out.printf("Modern couch has %d pillows. %n", couch.pillowCount());
                chair.sit();
                System.out.printf("Modern couch is comfortable? R/ %b. %n", couch.isComfortable());

            } catch (IllegalArgumentException e) {
                System.out.println("Your input is not a valid value.");
            }

            System.out.println();
            System.out.println("** Please provide another furniture type (MODERN or VICTORIAN), put EXIT to finish.");
            option = sc.nextLine();
        }
    }
}
