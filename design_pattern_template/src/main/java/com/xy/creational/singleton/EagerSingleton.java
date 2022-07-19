package com.xy.creational.singleton;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 饿汉式 单例模式
 *
 * @author XiaoYi
 * Created on 2022/7/18.
 */
public class EagerSingleton {

    private AtomicInteger id = new AtomicInteger(0);

    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
        System.out.println("EagerSingleton init...");

    }

    public static EagerSingleton getInstance(){
        return instance;
    }

    public int getId(){
        return id.incrementAndGet();
    }

    public static void main(String[] args) {
        System.out.println("...... main start ......");
        EagerSingleton instance = EagerSingleton.getInstance();
        System.out.println(instance.getId());

        EagerSingleton instance1 = EagerSingleton.getInstance();
        System.out.println(instance1.getId());

        System.out.println(instance == instance1);
    }
}
