package concretedecorators;

import abstractbasedecorator.ToppingDecorator;
import baseInterface.Pizza;

public class CheeseBurst extends ToppingDecorator {

    public CheeseBurst(Pizza pizza) {
      super(pizza);
    }
  
    @Override
    public String getDescription() {
      return super.getDescription() + ", Cheese Burst";
    }
  
    @Override
    public double getPrice() {
      return super.getPrice() + 2.00;
    }
  }
