package com.xiaoyi.decorator_pattern;

/**
 * Created on 2021/2/26.
 *
 * @author 小逸
 * @description
 */
public class BlackBorderDecorator extends ComponentDecorator {
    public BlackBorderDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        this.setScrollBar();
        super.display();
    }



    public void setScrollBar() {
        System.out.println("为构件增加黑色边框！");
    }
}
