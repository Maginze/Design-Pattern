package com.landiss.Singleton;

/**
 * 枚举类型是天生的单例
 * 1、避免了反射、反序列化漏洞
 * 2、调用效率高
 * 3、线程安全
 * 4、无懒加载效果。
 */
public enum SingletonDemo04 {
    INSTANCE;

    public void doService(){

    }
}
