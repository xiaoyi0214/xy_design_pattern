package com.xiaoyi.abstract_factory;

/**
 * Created on 2021/2/23.
 *
 * @author 小逸
 * @description
 */
public class SpringTextField implements TextField {
    @Override
    public void display() {
        System.out.println("spring text field 绿色");
    }
}
