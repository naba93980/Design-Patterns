package concretedecorators;

import abstractbasedecorator.ToppingDecorator;
import baseInterface.Pizza;

public class Pepperoni extends ToppingDecorator {

    public Pepperoni(Pizza pizza) {
      super(pizza);
    }
  
    @Override
    public String getDescription() {
      return super.getDescription() + ", Pepperoni";
    }
  
    @Override
    public double getPrice() {
      return super.getPrice() + 1.50;
    }
  }
