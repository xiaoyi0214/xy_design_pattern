package com.xiaoyi.abstract_factory;

/**
 * Created on 2021/2/23.
 *
 * @author 小逸
 * @description
 */
public class SpringButton implements Button {
    @Override
    public void display() {
        System.out.println("Spring button 浅绿色");
    }
}
