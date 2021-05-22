package com.xiaoyi.simple_factory;

/**
 * Created on 2021/2/23.
 *
 * @author 小逸
 * @description
 */
public class HistogramChart implements Chart {

    public HistogramChart(){
        System.out.println("创建柱状图");
    }
    @Override
    public void display() {
        System.out.println("显示柱状图");
    }
}
