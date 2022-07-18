package x01_oop.four_features.polymorphism;


/**
 * 排序动态数组
 *
 * @author liuanyi
 */
public class SortedDynamicArray extends DynamicArray {

    @Override
    public void add(Integer e) {
        ensureCapacity();
        for (int i = size - 1; i >= 0; --i) {
            // 保证数组中的数据有序
            if (elements[i] > e) {
                elements[i + 1] = elements[i];
            } else {
                break;
            }
        }
        elements[size + 1] = e;
        ++size;
    }
}
