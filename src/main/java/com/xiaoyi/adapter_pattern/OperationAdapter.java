package com.xiaoyi.adapter_pattern;

/**
 * Created on 2021/2/25.
 *
 * @author 小逸
 * @description
 */
public class OperationAdapter implements ScoreOperation {

    private QuickSort sortObj; //定义适配者QuickSort对象
    private BinarySearch searchObj; //定义适配者BinarySearch对象

    public OperationAdapter() {
        sortObj = new QuickSort();
        searchObj = new BinarySearch();
    }

    @Override
    public int[] sort(int[] array) {
        return sortObj.quickSort(array); //调用适配者类QuickSort的排序方法
    }

    @Override
    public int search(int[] array, int key) {
        return searchObj.binarySearch(array,key); //调用适配者类BinarySearch的查找方法
    }
}
