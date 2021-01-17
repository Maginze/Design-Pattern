package com.landiss.Singleton;

/**
 * 饿汉式单例模式
 * @author admin
 */
public class SingletonDemo01 {

	/**
	 * 类初始化的时候，实例instance对象，类初始化过程是线程安全的。此对象可能一直不会被调用，会造成资源浪费
	 * instance对象从属于SingletonDemo01这个类
	 */
	private static SingletonDemo01 instance = new SingletonDemo01();
	
	private SingletonDemo01() {}
	
	/**
	 * 此方法不需要同步，调用效率高
	 */
	public static SingletonDemo01 getInstance(){
		return instance;
	}
	
}
