package com.landiss.proxy.staticproxy;

/**
 * 业务类
 */
public class RealStar implements Star {

    @Override
    public void show() {
        System.out.println("业务逻辑实现");
    }

}
