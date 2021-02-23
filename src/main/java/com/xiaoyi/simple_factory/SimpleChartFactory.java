package com.xiaoyi.simple_factory;

/**
 * Created on 2021/2/23.
 *
 * @author 小逸
 * @description
 */
public class SimpleChartFactory {

    public static Chart getChart(String chartType){
        Chart chart = null;
        if ("histogram".equals(chartType)){
            chart = new HistogramChart();
            System.out.println("初始化设置柱状图");
        }else if("pie".equals(chartType)){
            chart = new PieChart();
            System.out.println("初始化设置饼状图");
        }
        return chart;
    }
}
