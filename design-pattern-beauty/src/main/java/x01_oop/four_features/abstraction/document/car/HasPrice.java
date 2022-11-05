package x01_oop.four_features.abstraction.document.car;

import x01_oop.four_features.abstraction.document.Document;

import java.util.Optional;

/**
 * @author XiaoYi
 * Created on 2022/11/6.
 */
public interface HasPrice extends Document {

    default Optional<Number> getPrice() {
        return Optional.ofNullable((Number) get(CarPropertyEnum.PRICE.name()));
    }
}
