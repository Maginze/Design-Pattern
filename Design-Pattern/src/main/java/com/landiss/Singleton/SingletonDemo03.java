package com.landiss.Singleton;

/**
 * 静态内部类式，优点有3
 * 1、实现懒汉式加载
 * 2、保持线程安全
 * 3、调用效率高
 * @author admin
 *
 */
public class SingletonDemo03 {
	
	//内部类不会再外部类加载时一起加载，而是在用到内部类对象时才进行加载，也是线程安装的
	private static class SingletonObject{
		private static final SingletonDemo03 instance = new SingletonDemo03();
	}

	private SingletonDemo03() {
		System.out.println("00000000000");
	}
	
	public static SingletonDemo03 getInstance(){
		return SingletonObject.instance;
	}
	
}
