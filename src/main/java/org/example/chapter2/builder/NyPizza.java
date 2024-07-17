package org.example.chapter2.builder;

import java.util.Objects;

public class NyPizza extends Pizza{


  NyPizza(Builder builder, Size size) {
    super(builder);
    this.size = size;
  }

  public enum Size {SMALL, MEDIUM, LARGE};

  private final Size size;

  public static class NyBuilder extends Pizza.Builder<NyBuilder> {
    private final Size size;

    public NyBuilder(Size size) {
      this.size = Objects.requireNonNull(size);
    }

    @Override
    NyPizza build() {
      return new NyPizza(this, size);
    }

    @Override
    protected NyBuilder seft() {
      return this;
    }
  }


  @Override
  public String toString() {
    return "NyPizza{" +
        "size=" + size +
        ", toppings=" + toppings +
        '}';
  }
}
