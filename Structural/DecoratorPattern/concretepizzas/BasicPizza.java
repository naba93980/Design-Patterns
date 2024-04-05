package concretepizzas;

import baseInterface.Pizza;

public class BasicPizza implements Pizza {

    @Override
    public String getDescription() {
      return "Basic Pizza";
    }
  
    @Override
    public double getPrice() {
      return 5.00;
    }
  }
  
  