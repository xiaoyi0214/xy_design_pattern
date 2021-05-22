package com.xiaoyi.prototype_pattern.prototype_manager;

/**
 * Created on 2021/2/23.
 *
 * @author 小逸
 * @description
 */
public class FARDocument implements OfficialDocument{
    @Override
    public OfficialDocument clone() {
        OfficialDocument far = null;
        try {
            far = (OfficialDocument)super.clone();
        } catch(CloneNotSupportedException  e) {
            System.out.println("不支持复制！");
        }
        return far;
    }

    @Override
    public void display() {
        System.out.println("《可行性分析报告》");
    }
}
