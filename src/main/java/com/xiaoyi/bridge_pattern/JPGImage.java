package com.xiaoyi.bridge_pattern;

/**
 * Created on 2021/2/25.
 *
 * @author 小逸
 * @description
 */
public class JPGImage extends Image {
    @Override
    public void parseFile(String fileName) {
        imp.doPaint();
        System.out.println(fileName + "，格式为JPG。");
    }
}
