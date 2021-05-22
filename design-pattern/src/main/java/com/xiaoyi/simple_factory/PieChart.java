package com.xiaoyi.simple_factory;

/**
 * Created on 2021/2/23.
 *
 * @author 小逸
 * @description
 */
public class PieChart implements Chart {

    public PieChart(){
        System.out.println("创建饼状图");
    }
    @Override
    public void display() {
        System.out.println("显示饼状图");
    }
}
