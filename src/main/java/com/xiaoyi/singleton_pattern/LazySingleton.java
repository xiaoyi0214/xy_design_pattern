package com.xiaoyi.singleton_pattern;

/**
 * Created on 2021/2/23.
 *
 * @author 小逸
 * @description
 */
public class LazySingleton {
    private LazySingleton(){}

    private static volatile LazySingleton lazySingleton = null;

    // 性能降低
    synchronized public static LazySingleton getInstance1(){
        if (lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
    // 多线程情况下，会出现多个对象（当两个线程都通过了lazySingleton == null判断的时候）
    public static LazySingleton getInstance2(){
        if (lazySingleton == null){
            synchronized (LazySingleton.class){
                lazySingleton = new LazySingleton();
            }
        }
        return lazySingleton;
    }

    // double-check机制，需要在 lazySingleton 前加 volatile关键字，禁止jvm重排序
    public static LazySingleton getInstance3(){
        if (lazySingleton == null){
            synchronized (LazySingleton.class){
                if (lazySingleton == null){
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }
}
