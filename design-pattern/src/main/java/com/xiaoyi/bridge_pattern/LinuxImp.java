package com.xiaoyi.bridge_pattern;

/**
 * Created on 2021/2/25.
 *
 * @author 小逸
 * @description
 */
public class LinuxImp implements ImageImp {
    @Override
    public void doPaint() {
        System.out.print("在Linux操作系统中显示图像：");
    }
}
