package com.xiaoyi.prototype_pattern;

import java.io.Serializable;

/**
 * Created on 2021/2/23.
 *
 * @author 小逸
 * @description
 */
public class Attachment implements Serializable {
    private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void download(){
        System.out.println("下载附件，文件名："+this.name);
    }
}
