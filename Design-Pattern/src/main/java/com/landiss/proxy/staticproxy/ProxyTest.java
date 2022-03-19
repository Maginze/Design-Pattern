package com.landiss.proxy.staticproxy;

public class ProxyTest {

    public static void main(String[] args) {
        Star realStar = new RealStar();
        ProxyStar proxyStar = new ProxyStar(realStar);
        proxyStar.show();
    }
}
