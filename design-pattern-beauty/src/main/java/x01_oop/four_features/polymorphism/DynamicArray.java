package x01_oop.four_features.polymorphism;

/**
 * 动态数组
 *
 * @author XiaoYi
 * Created on 2021/12/16.
 */
public class DynamicArray {
    private static final int DEFAULT_CAPACITY = 10;
    protected int size = 0;
    protected int capacity = DEFAULT_CAPACITY;
    protected Integer[] elements = new Integer[DEFAULT_CAPACITY];

    public int size() {
        return this.size;
    }

    public Integer get(int index) {
        return elements[index];
    }

    public void add(Integer e) {
        ensureCapacity();
        elements[size++] = e;
    }

    protected void ensureCapacity() {
        //... 如果数组满了就扩容... 代码省略...
    }
}

