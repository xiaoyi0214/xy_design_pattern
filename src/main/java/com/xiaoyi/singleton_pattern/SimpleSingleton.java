package com.xiaoyi.singleton_pattern;

/**
 * Created on 2021/2/23.
 *
 * @author 小逸
 * @description 简单的单例模式
 */
public class SimpleSingleton {

    private SimpleSingleton(){}

    private static SimpleSingleton simpleSingleton = null;

    public static SimpleSingleton getInstance(){
        if (simpleSingleton == null){
            simpleSingleton = new SimpleSingleton();
        }
        return simpleSingleton;
    }
}
