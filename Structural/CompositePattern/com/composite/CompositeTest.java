package com.composite;

public class CompositeTest {
    public static void main(String[] args) {
        Component hd=new Leaf(1500, "HDD");
        Component mouse=new Leaf(200, "Mouse");
        Component monitor=new Leaf(5500, "Monitor");
        Component ram=new Leaf(3500, "Ram");
        Component CPU=new Leaf(10000, "CPU");

        Composite ph=new Composite("Peripheral");
        Composite cabinet=new Composite("Cabinet");
        Composite motherBoard=new Composite("MB");
        Composite computer=new Composite("Computer");

        ph.addComponent(monitor);
        ph.addComponent(mouse);

        motherBoard.addComponent(ram);
        motherBoard.addComponent(CPU);

        cabinet.addComponent(motherBoard);
        cabinet.addComponent(hd);

        computer.addComponent(ph);
        computer.addComponent(cabinet);

        computer.showPrice();
    }
}
