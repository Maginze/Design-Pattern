package com.landiss.proxy.staticproxy;

import java.util.Date;

public class ProxyStar implements Star {

    private Star star;


    public ProxyStar(Star star) {
        this.star = star;
    }

    @Override
    public void getTime() {
        System.out.println("ProxyStar "+new Date());
    }

    @Override
    public void show() {
        star.show();
    }
}
