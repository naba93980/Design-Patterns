package com.prototype;

public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException
    {
        BookShop bs1 = new BookShop();
        bs1.setShopName("Nabas shop");
        bs1.loadData();
        // bs1.getBooks().remove(2);
        System.out.println(bs1.getBooks());


        // prototype design pattern - creating bs2 from bs1
        
        // BookShop bs2 = (BookShop) bs1.clone();
        BookShop bs2 = bs1.clone();            // deep clone of bs1

        bs1.getBooks().remove(2);     // element at index 2 removed
        System.out.println(bs1.getBooks());

        bs2.setShopName("Nabas shop 2");
        // bs2.loadData();
        System.out.println(bs2.getBooks());
    }
}
