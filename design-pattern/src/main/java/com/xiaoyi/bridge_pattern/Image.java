package com.xiaoyi.bridge_pattern;

/**
 * Created on 2021/2/25.
 *
 * @author 小逸
 * @description
 */
public abstract class Image {

    protected ImageImp imp;

    public void setImageImp(ImageImp imp) {
        this.imp = imp;
    }

    public abstract void parseFile(String fileName);
}
