package com.landiss.Singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Client0202 {

    public static void main(String[] args) throws Exception{
        SingletonDemo02 instance1 = SingletonDemo02.getInstance();
        SingletonDemo02 instance2 = SingletonDemo02.getInstance();
        System.out.println(instance1);
        System.out.println(instance2);

        // 对象序列化需要实现Serializable接口
        FileOutputStream fos = new FileOutputStream("E://IdeaProjects/Design-Pattern/Singleton.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(instance1);
        oos.close();
        fos.close();

        //反序列化破解单例模式。防止破解实现建SingletonDemo0202的readResolve方法
        FileInputStream fis = new FileInputStream("E://IdeaProjects/Design-Pattern/Singleton.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        SingletonDemo02 instance4 = (SingletonDemo02) ois.readObject();
        System.out.println(instance4);
    }

}
