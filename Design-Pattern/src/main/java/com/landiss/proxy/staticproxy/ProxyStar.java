package com.landiss.proxy.staticproxy;

/**
 * 代理类
 */
public class ProxyStar implements Star {

    private Star star;


    public ProxyStar(Star star) {
        this.star = star;
    }

    @Override
    public void show() {
        star.show();
    }
}
