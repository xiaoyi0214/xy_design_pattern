package com.xiaoyi.decorator_pattern;

/**
 * Created on 2021/2/26.
 *
 * @author 小逸
 * @description
 */
public class ScrollBarDecorator extends ComponentDecorator {
    public ScrollBarDecorator(Component component) {
        super(component);
    }

    public void display() {
        this.setScrollBar();
        super.display();
    }

    public void setScrollBar() {
        System.out.println("为构件增加滚动条！");
    }
}
