package abstractbasedecorator;

import baseInterface.Pizza;

public abstract class ToppingDecorator implements Pizza {

    protected Pizza pizza;
  
    public ToppingDecorator(Pizza pizza) {
      this.pizza = pizza;
    }
  
    @Override
    public String getDescription() {
      return pizza.getDescription();
    }
  
    @Override
    public double getPrice() {
      return pizza.getPrice();
    }
  }
  
