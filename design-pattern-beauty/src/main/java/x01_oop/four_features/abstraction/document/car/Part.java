package x01_oop.four_features.abstraction.document.car;

import x01_oop.four_features.abstraction.document.AbstractDocument;

import java.util.Map;

/**
 * @author XiaoYi
 * Created on 2022/11/6.
 */
public class Part extends AbstractDocument implements HasModel, HasPrice, HasType{
    public Part(Map<String, Object> properties) {
        super(properties);
    }
}
