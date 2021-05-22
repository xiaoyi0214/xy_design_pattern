package com.xiaoyi.prototype_pattern.prototype_manager;

/**
 * Created on 2021/2/23.
 *
 * @author 小逸
 * @description
 */
public interface OfficialDocument extends Cloneable{
    public  OfficialDocument clone();

    public  void display();
}
