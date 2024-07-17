package org.example.chapter2.builder;

import org.example.chapter2.builder.NyPizza.Size;
import org.example.chapter2.builder.Pizza.Topping;

public class App {

  public static void main(String[] args) {
    NyPizza pizza = new NyPizza.NyBuilder(Size.SMALL)
        .addTopping(Topping.MUSHROOM)
        .addTopping(Topping.ONION)
        .build();

    Calzone calzone = new Calzone.CalBuilder()
        .sauceInside().addTopping(Topping.ONION)
        .addTopping(Topping.PEPPER)
        .build();

    System.out.println("pizza = " + pizza);
    System.out.println("calzone = " + calzone);
  }
}
