package x01_oop.four_features.abstraction.document.car;

import x01_oop.four_features.abstraction.document.Document;

import java.util.stream.Stream;

/**
 * @author XiaoYi
 * Created on 2022/11/6.
 */
public interface HasParts extends Document {

    default Stream<Part> getParts() {
        return children(CarPropertyEnum.PARTS.toString(), Part::new);
    }
}
