package com.xiaoyi.abstract_factory;

/**
 * Created on 2021/2/23.
 *
 * @author 小逸
 * @description
 */
public interface SkinFactory {
    public Button createButton();
    public TextField createTextField();
    public ComboBox createComboBox();
}
