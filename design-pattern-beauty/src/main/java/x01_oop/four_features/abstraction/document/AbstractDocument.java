package x01_oop.four_features.abstraction.document;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * @author XiaoYi
 * Created on 2022/11/6.
 */
public abstract class AbstractDocument implements Document {

    private final Map<String, Object> properties;

    public AbstractDocument(Map<String, Object> properties) {
        Objects.requireNonNull(properties, "properties map is required");
        this.properties = properties;
    }

    @Override
    public void put(String key, Object value) {
        properties.put(key, value);
    }

    @Override
    public Object get(String key) {
        return properties.get(key);
    }

    @Override
    public <T> Stream<T> children(String key, Function<Map<String, Object>, T> constructor) {
        return Stream.of(get(key))
            .filter(Objects::nonNull)
            .map(el -> (List<Map<String, Object>>) el)
            .findAny()
            .orElse(Collections.emptyList())
            .stream()
            .map(constructor);
    }
}
