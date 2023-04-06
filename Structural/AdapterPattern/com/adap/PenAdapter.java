// 2 - Adapter

package com.adap;

import com.naba.PenAdaptee;

public class PenAdapter implements Pen {
    PenAdaptee pp = new PenAdaptee();       // adaptee inside adapter using composition

    @Override
    public void write(String str) {
        pp.mark(str);
    }
    
}
