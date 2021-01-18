package com.landiss.Singleton;

public class Client01 {

    public static void main(String[] args) {
        SingletonDemo03 instance1 = SingletonDemo03.getInstance();
        SingletonDemo03 instance2 = SingletonDemo03.getInstance();
        System.out.println(instance1);
        System.out.println(instance2);
    }

}
