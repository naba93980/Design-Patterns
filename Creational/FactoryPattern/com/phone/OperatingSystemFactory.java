package com.phone;

public class OperatingSystemFactory {

    public OS getInstanceOs(String str) {
        if (str.equals("Windows")) {
            return new Windows();
        } else if (str.equals("IOS")) {
            return new IOS();
        } else
            return new Android();
    }

}
