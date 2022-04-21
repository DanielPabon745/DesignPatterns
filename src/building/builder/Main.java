package building.builder;

import building.builder.builder.Contact;
import building.builder.builder.Name;
import building.builder.builder.User;

public class Main {

        /*
            El patron builder es utilizado cuando tenemos objetos que pueden ser de varios tipos
            o con muchos atributos.

            Para evitar una acumulacion de subclases cada una con cualidades diferentes a las demas,
            o tener una clase base con un constructor el cual tendra todas la posibles opciones de
            parametrizacion del objeto, donde dicho constructor en muchos casos no utilizara todos sus
            parametros, es recomendable el uso del patron Builder, ya que con el podemos utilizar
            unicamente los valores necesarios.
         */

    public static void main(String[] args) {
        /*
            A continuacion, se realiza un ejemplo de como utilizar el patron Builder
            para la construccion de un objeto USER, el cual puede tener algunos campos
            nulos y en donde se ingresara solo la informacion pertinente o existente de
            la persona.
         */

        User personalized = new User.Builder()
                .id(121312)
                .email("newuser@email.com")
                .build();


        User newCompleteUser = new User.Builder()
                .id(121312)
                .email("newuser@email.com")
                .name(new Name.Builder()
                        .firstName("Daniel")
                        .middleName("Eduardo")
                        .lastName("Mozo")
                        .alias("Dani")
                        .build())
                .contact(new Contact.Builder()
                        .address("St. Any, 1442-21 St. Paulo")
                        .phoneNumber("112382700")
                        .build())
                .build();

        System.out.println(newCompleteUser.toString());
        System.out.println(personalized.toString());
    }
}
