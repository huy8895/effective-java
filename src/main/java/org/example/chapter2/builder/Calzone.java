package org.example.chapter2.builder;

public class Calzone extends Pizza{
  private final boolean sauceInside;

  Calzone(CalBuilder builder) {
    super(builder);
    this.sauceInside = builder.sauceInside;
  }

  public static class CalBuilder extends Pizza.Builder<CalBuilder> {
    private boolean sauceInside = false;

    public CalBuilder sauceInside(){
      sauceInside = true;
      return this;
    }

    @Override
    Calzone build() {
      return new Calzone(this);
    }

    @Override
    protected CalBuilder seft() {
      return this;
    }

  }

  @Override
  public String toString() {
    return "Calzone{" +
        "sauceInside=" + sauceInside +
        ", toppings=" + toppings +
        '}';
  }
}
