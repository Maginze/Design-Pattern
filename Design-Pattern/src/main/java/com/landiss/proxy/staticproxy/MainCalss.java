package com.landiss.proxy.staticproxy;

public class MainCalss {

    public static void main(String[] args) {
        Star realStar = new RealStar();
        ProxyStar proxyStar = new ProxyStar(realStar);
        proxyStar.getTime();
        proxyStar.show();

        int a = 1;

        System.out.println();
    }
}
