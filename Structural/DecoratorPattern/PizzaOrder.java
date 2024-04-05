import baseInterface.Pizza;
import concretedecorators.CheeseBurst;
import concretedecorators.Pepperoni;
import concretepizzas.BasicPizza;

public class PizzaOrder {

    public static void main(String[] args) {
      Pizza pizza = new BasicPizza();
  
      // Decorate with Pepperoni
      pizza = new Pepperoni(pizza);
  
      // Further decorate with Cheese Burst
      pizza = new CheeseBurst(pizza);
  
      System.out.println("Your order: " + pizza.getDescription());
      System.out.println("Total Price: $" + pizza.getPrice());
    }
  }
  
