// 1 -  client

package com.adap;

public class AssignmentWork {

    private Pen p;

    public Pen getP() {
        return p;
    }

    public void setP(Pen p) {     // expecting object of type Pen
        this.p = p;
    }

    public void writeAssignment(String str){
        p.write(str);
    }
}
