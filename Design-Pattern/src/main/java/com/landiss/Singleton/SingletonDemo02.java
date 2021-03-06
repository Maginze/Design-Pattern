package com.landiss.Singleton;

import java.io.Serializable;

/**
 * 懒汉式单例模式
 * @author admin
 */
public class SingletonDemo02 implements Serializable{

	//类加载的时候没有实例化对象，在需要用到此对象的时候调用getInstance()方法获取。
	private static SingletonDemo02 instance;

	private SingletonDemo02() {}

	/**
	 * 通过synchronized保证SingletonDemo02类的对象是单例的，由于此对象在方法被调用时创建，
	 * 有可能会存在争抢锁的情况，因此调用效率不高。但是不会浪费资源
	 */
	public static synchronized SingletonDemo02 getInstance(){
		if(null == instance){
			instance = new SingletonDemo02();
		}
		return instance;
	}

}
