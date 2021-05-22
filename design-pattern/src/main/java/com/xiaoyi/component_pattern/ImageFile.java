package com.xiaoyi.component_pattern;

/**
 * Created on 2021/2/25.
 *
 * @author 小逸
 * @description
 */
public class ImageFile extends AbstractFile {
    private String name;

    public ImageFile(String name){
        this.name = name;
    }

    @Override
    public void add(AbstractFile file) {
        System.out.println("对不起，不支持该方法！");
    }

    @Override
    public void remove(AbstractFile file) {
        System.out.println("对不起，不支持该方法！");
    }

    @Override
    public AbstractFile getChild(int i) {
        System.out.println("对不起，不支持该方法！");
        return null;
    }

    @Override
    public void killVirus() {
        System.out.println("----对图像文件'" + name + "'进行杀毒");
    }
}
