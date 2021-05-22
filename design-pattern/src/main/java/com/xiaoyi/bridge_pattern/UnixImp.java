package com.xiaoyi.bridge_pattern;

/**
 * Created on 2021/2/25.
 *
 * @author 小逸
 * @description
 */
public class UnixImp implements ImageImp {
    @Override
    public void doPaint() {
        System.out.print("在Unix操作系统中显示图像：");
    }
}
