package com.xiaoyi.adapter_pattern;

/**
 * Created on 2021/2/25.
 *
 * @author 小逸
 * @description 抽象成绩操作类：目标接口
 */
public interface ScoreOperation {
    public int[] sort(int array[]);
    public int search(int array[], int key);
}
