package com.composite;

import java.util.ArrayList;
import java.util.List;

// common methods to be implemented by both 
interface Component {
    void showPrice();
}

class Leaf implements Component {

    int price;
    String name;

    public Leaf(int price, String name) {
        this.price = price;
        this.name = name;
    }

    @Override
    public void showPrice() {
        System.out.println(name + ":" + price);
    }
}

class Composite implements Component {

    String name;
    List<Component> components = new ArrayList<Component>();


    public Composite(String name) {
        this.name = name;
    }

    public void addComponent(Component component) {
        components.add(component);
    }

    @Override
    public void showPrice() {

        System.out.println(name);
        for(Component c : components){
            c.showPrice();
        }
    }
}
 