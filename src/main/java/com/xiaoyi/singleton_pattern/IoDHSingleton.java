package com.xiaoyi.singleton_pattern;

/**
 * Created on 2021/2/23.
 *
 * @author 小逸
 * @description Initialization Demand Holder
 */
public class IoDHSingleton {

    private IoDHSingleton(){}

    private static class SingletonHolder{
        private final static IoDHSingleton IO_DH_SINGLETON = new IoDHSingleton();
    }

    public static IoDHSingleton getInstance(){
        return SingletonHolder.IO_DH_SINGLETON;
    }
}
