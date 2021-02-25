package com.xiaoyi.component_pattern;

/**
 * Created on 2021/2/25.
 *
 * @author 小逸
 * @description 抽象文件
 */
public abstract class AbstractFile {
    public abstract void add(AbstractFile file);
    public abstract void remove(AbstractFile file);
    public abstract AbstractFile getChild(int i);
    public abstract void killVirus();
}
