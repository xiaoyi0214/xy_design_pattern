package com.xy.creational.singleton;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 懒汉式 单例模式
 *
 * @author XiaoYi
 * Created on 2022/7/18.
 */
public class LazySingleton {

    private AtomicInteger id = new AtomicInteger(0);

    private static LazySingleton instance;

    private LazySingleton() {
        System.out.println("lazySingleton init...");
    }

    public static synchronized LazySingleton getInstance(){
        if (instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }

    public int getId(){
        return id.incrementAndGet();
    }


    public static void main(String[] args) {
        System.out.println("...... main start ......");

        LazySingleton instance = LazySingleton.getInstance();

        System.out.println(instance.getId());
    }
}
