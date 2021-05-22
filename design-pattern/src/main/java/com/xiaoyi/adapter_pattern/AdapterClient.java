package com.xiaoyi.adapter_pattern;

/**
 * Created on 2021/2/25.
 *
 * @author 小逸
 * @description
 */
public class AdapterClient {
    public static void main(String[] args) {
        ScoreOperation operation;  //针对抽象目标接口编程
//        operation = (ScoreOperation)XMLUtil.getBean(); //读取配置文件，反射生成对象
        /*如果需要使用其他排序算法类和查找算法类，可以增加一个新的适配器类，使用新的适配器来适配新的算法，原有代码无须修改。通过引入配置文件和反射机制，可以在不修改客户端代码的情况下使用新的适配器，无须修改源代码，符合“开闭原则”*/
        operation = new OperationAdapter();
        int scores[] = {84,76,50,69,90,91,88,96}; //定义成绩数组
        int result[];
        int score;

        System.out.println("成绩排序结果：");
        result = operation.sort(scores);

        //遍历输出成绩
        for(int i : scores) {
            System.out.print(i + ",");
        }
        System.out.println();

        System.out.println("查找成绩90：");
        score = operation.search(result,90);
        if (score != -1) {
            System.out.println("找到成绩90。");
        }
        else {
            System.out.println("没有找到成绩90。");
        }

        System.out.println("查找成绩92：");
        score = operation.search(result,92);
        if (score != -1) {
            System.out.println("找到成绩92。");
        }
        else {
            System.out.println("没有找到成绩92。");
        }
    }
}

