package com.xiaoyi.prototype_pattern;

/**
 * Created on 2021/2/23.
 *
 * @author 小逸
 * @description
 */
public class WeeklyLog implements Cloneable{
    private  String name;
    private  String date;
    private  String content;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public WeeklyLog clone(){
        Object object = null;
        try {
            object = super.clone();
            return (WeeklyLog) object;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
