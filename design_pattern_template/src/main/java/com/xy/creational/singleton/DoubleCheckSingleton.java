package com.xy.creational.singleton;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 双重检测 单例模式
 *
 * @author XiaoYi
 * Created on 2022/7/18.
 */
public class DoubleCheckSingleton {


    private AtomicInteger id = new AtomicInteger(0);

    private static DoubleCheckSingleton instance;

    private DoubleCheckSingleton() {
        System.out.println("DoubleCheckSingleton init...");
    }

    public static DoubleCheckSingleton getInstance(){
        if (instance == null){
            synchronized (DoubleCheckSingleton.class){
                if (instance == null){
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }

    public int getId(){
        return id.incrementAndGet();
    }
}


