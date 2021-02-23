package com.xiaoyi.abstract_factory;

/**
 * Created on 2021/2/23.
 *
 * @author 小逸
 * @description
 */
public class SpringSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SpringButton();
    }

    @Override
    public TextField createTextField() {
        return new SpringTextField();
    }

    @Override
    public ComboBox createComboBox() {
        return new SpringComboBox();
    }
}
