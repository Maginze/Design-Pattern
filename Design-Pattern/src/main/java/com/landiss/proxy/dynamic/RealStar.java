package com.landiss.proxy.dynamic;


public class RealStar implements Star {

    @Override
    public void show() {
        System.out.println("RealStar Showing Time");
    }
}
