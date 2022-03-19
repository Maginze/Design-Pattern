package com.landiss.proxy.dynamic;

import java.lang.reflect.Proxy;

public class DynamicTest {

    public static void main(String[] args) {
        Star realStar = new RealStar();
        StarHandler handler = new StarHandler(realStar);

        //动态代理类
        Star proxy = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),new Class[]{Star.class}, handler);

        proxy.show();
        proxy.getTime();
    }
}
