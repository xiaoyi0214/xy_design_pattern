package com.xiaoyi.singleton_pattern;

/**
 * Created on 2021/2/23.
 *
 * @author 小逸
 * @description 饿汉式单例
 */
public class EagerSingleton {
    private EagerSingleton(){}

    private static final EagerSingleton EAGER_SINGLETON = new EagerSingleton();

    private static EagerSingleton getInstance(){
        return EAGER_SINGLETON;
    }
}
