package org.example.chapter2.builder;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public abstract class Pizza {

  protected Pizza(Set<Topping> toppings) {
    this.toppings = toppings;
  }

  public enum Topping {HAM, MUSHROOM, ONION, PEPPER, SAUSAGE};

  final Set<Topping> toppings;

  abstract static class Builder<T extends Builder<T>> {
    EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

    public T addTopping(Topping topping){
      toppings.add(Objects.requireNonNull(topping));
      return seft();
    }

    abstract Pizza build();
    protected abstract T seft();
  }

  Pizza(Builder<?> builder){
    toppings = builder.toppings.clone();
  }
}
