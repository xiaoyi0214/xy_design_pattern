package x01_oop.four_features.polymorphism;

/**
 * 多态举例：
 *
 * @author XiaoYi
 * Created on 2021/12/16.
 */
public class MainTest {

    public static void test(DynamicArray dynamicArray) {
        dynamicArray.add(5);
        dynamicArray.add(1);
        dynamicArray.add(3);
        for (int i = 0; i < dynamicArray.size(); ++i) {
            System.out.println(dynamicArray.get(i));
        }
    }

    public static void main(String[] args) {

    }
}
