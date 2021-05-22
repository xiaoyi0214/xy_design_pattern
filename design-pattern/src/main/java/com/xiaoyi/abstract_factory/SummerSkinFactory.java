package com.xiaoyi.abstract_factory;

/**
 * Created on 2021/2/23.
 *
 * @author 小逸
 * @description
 */
public class SummerSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SummerButton();
    }

    @Override
    public TextField createTextField() {
        return new SummerTextField();
    }

    @Override
    public ComboBox createComboBox() {
        return new SummerComboBox();
    }
}
