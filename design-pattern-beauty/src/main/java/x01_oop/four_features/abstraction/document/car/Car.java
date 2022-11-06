package x01_oop.four_features.abstraction.document.car;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import x01_oop.four_features.abstraction.document.AbstractDocument;

import java.util.Map;
import java.util.logging.Logger;

/**
 * @author XiaoYi
 * Created on 2022/11/6.
 */
public class Car extends AbstractDocument implements HasModel, HasParts, HasPrice, HasFactory {

    public Car(Map<String, Object> properties) {
        super(properties);
    }


    public static void main(String[] args) {

        Logger logger = Logger.getLogger("Car.class");

        System.out.println("Constructing parts and car");

        Map<String, Object> wheelProperties = Maps.newHashMap();
        wheelProperties.put(CarPropertyEnum.TYPE.name(), "wheel");
        wheelProperties.put(CarPropertyEnum.MODEL.name(), "15C");
        wheelProperties.put(CarPropertyEnum.PRICE.name(), 100L);
        wheelProperties.put(CarPropertyEnum.FACTORY.name(), "米其林轮胎制造厂");


        Map<String, Object> doorProperties = Maps.newHashMap();
        doorProperties.put(CarPropertyEnum.TYPE.name(), "door");
        doorProperties.put(CarPropertyEnum.MODEL.name(), "Lambo");
        doorProperties.put(CarPropertyEnum.PRICE.name(), 300L);
        doorProperties.put(CarPropertyEnum.FACTORY.name(), "上海制造厂");

        Map<String, Object> carProperties = Maps.newHashMap();
        carProperties.put(CarPropertyEnum.MODEL.name(), "300SL");
        carProperties.put(CarPropertyEnum.PRICE.name(), 10000L);
        carProperties.put(CarPropertyEnum.PARTS.name(), Lists.newArrayList(wheelProperties, doorProperties));
        carProperties.put(CarPropertyEnum.FACTORY.name(), "梅赛德斯奔驰天津工厂");


        Car car = new Car(carProperties);

        System.out.println("Here is our car:");
        System.out.println("-> model: "+ car.getModel().orElseThrow(()-> new IllegalArgumentException("model not exist")));
        System.out.println("-> price: "+ car.getPrice().orElseThrow(()-> new IllegalArgumentException("price not exist")));
        System.out.println("-> factory: "+ car.getFactory().orElseThrow(()-> new IllegalArgumentException("factory not exist")));
        System.out.println("-> parts: ");
        car.getParts().forEach(p -> System.out.println(
            p.getType().orElse(null) + ": " +
            p.getModel().orElse(null)  + ": " +
            p.getFactory().orElse(null)  + ": " +
            p.getPrice().orElse(null))
        );

        // Constructing parts and car
        // Here is our car:
        // model: 300SL
        // price: 10000
        // parts:
        // wheel/15C/100
        // door/Lambo/300
    }

}
