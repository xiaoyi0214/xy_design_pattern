package com.xiaoyi.prototype_pattern.prototype_manager;

import com.xiaoyi.prototype_pattern.WeeklyLog;
import com.xiaoyi.prototype_pattern.WeeklyLogDeepClone;

import java.util.Hashtable;

/**
 * Created on 2021/2/23.
 *
 * @author 小逸
 * @description 原型管理器：使用饿汉单例实现
 */
public class PrototypeManager {
    //定义一个Hashtable，用于存储原型对象

    private Hashtable ht=new Hashtable();

    private static PrototypeManager pm =  new PrototypeManager();

    private  PrototypeManager() {
        ht.put("far",new FARDocument());
        ht.put("srs",new SRSDocument());
    }

    //增加新的公文对象
    public void addOfficialDocument(String  key,OfficialDocument doc) {
        ht.put(key,doc);
    }

    //通过浅克隆获取新的公文对象
    public OfficialDocument  getOfficialDocument(String key) {
        return  ((OfficialDocument)ht.get(key)).clone();
    }

    public static PrototypeManager  getPrototypeManager() {
        return pm;
    }
}
