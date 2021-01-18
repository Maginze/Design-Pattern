package com.landiss.proxy.staticproxy;

public class RealStar implements Star {

    @Override
    public void getTime() {

    }

    @Override
    public void show() {
        System.out.println("RealStar Showing Time");
    }
}
