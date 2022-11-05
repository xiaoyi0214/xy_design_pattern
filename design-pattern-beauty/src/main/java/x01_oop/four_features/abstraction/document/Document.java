package x01_oop.four_features.abstraction.document;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * 抽象文档接口
 *
 * @author XiaoYi
 * Created on 2022/11/6.
 */
public interface Document {

    void put(String key, Object value);

    Object get(String key);

    <T> Stream<T> children(String key, Function<Map<String, Object>, T> constructor);
}
