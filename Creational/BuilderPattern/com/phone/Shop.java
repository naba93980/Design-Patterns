package com.phone;

public class Shop {
    public static void main(String[] args) {
        Phone p=new PhoneBuilder().setOs("Android").setRam(8).setProcessor("Qualcomm").getPhone();
       p.toString();
    }
}
