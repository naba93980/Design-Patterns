package concretepizzas;

public class VeggiePizza extends BasicPizza {
  
    @Override
    public String getDescription() {
      return super.getDescription() + ", Veggies";
    }
  
    @Override
    public double getPrice() {
      return super.getPrice() + 2.00;
    }
  }