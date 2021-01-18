package com.landiss.proxy.dynamicproxy;

import java.util.Date;

public class RealStar implements Star {

    @Override
    public void getTime() {
        System.out.println("RealStar "+new Date());
    }

    @Override
    public void show() {
        System.out.println("RealStar Showing Time");
    }
}
