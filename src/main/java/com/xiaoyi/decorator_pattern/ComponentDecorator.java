package com.xiaoyi.decorator_pattern;

/**
 * Created on 2021/2/26.
 *
 * @author 小逸
 * @description
 */
public class ComponentDecorator extends Component {
    private Component component;  //维持对抽象构件类型对象的引用

    public ComponentDecorator(Component  component) { //注入抽象构件类型的对象
        this.component = component;
    }

    @Override
    public void display() {
        component.display();
    }
}
