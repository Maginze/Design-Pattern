package com.landiss.Singleton;

import java.lang.reflect.Constructor;

public class Client0201 {

    public static void main(String[] args) throws Exception {
        SingletonDemo02 instance1 = SingletonDemo02.getInstance();
        SingletonDemo02 instance2 = SingletonDemo02.getInstance();
        System.out.println(instance1);
        System.out.println(instance2);

        //反射方式破解懒汉式单例创建，防止反射漏洞见SingletonDemo0201
        Class<SingletonDemo02> clazz = (Class<SingletonDemo02>) Class.forName("com.landiss.Singleton.SingletonDemo02");
        Constructor<SingletonDemo02> con = clazz.getDeclaredConstructor(null);
        con.setAccessible(true);
        SingletonDemo02 instance3 = con.newInstance();
        System.out.println(instance3);

    }

}
