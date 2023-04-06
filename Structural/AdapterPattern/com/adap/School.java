package com.adap;

public class School {
    public static void main(String[] args) {
        Pen p = new PenAdapter();  
        AssignmentWork aw = new AssignmentWork();
        aw.setP(p);
        aw.writeAssignment("my name is Nabajyoti Modak");
    }
}

// https://www.youtube.com/watch?v=qG286LQM6BU