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
public class Car extends AbstractDocument implements HasModel, HasParts, HasPrice {

    public Car(Map<String, Object> properties) {
        super(properties);
    }


    public static void main(String[] args) {

        Logger logger = Logger.getLogger("Car.class");

        System.out.println("Constructing parts and car");

        Map<String, Object> wheelProperties = Maps.newHashMap();
        wheelProperties.put(CarPropertyEnum.TYPE.toString(), "wheel");
        wheelProperties.put(CarPropertyEnum.MODEL.toString(), "15C");
        wheelProperties.put(CarPropertyEnum.PRICE.toString(), 100L);


        Map<String, Object> doorProperties = Maps.newHashMap();
        doorProperties.put(CarPropertyEnum.TYPE.toString(), "door");
        doorProperties.put(CarPropertyEnum.MODEL.toString(), "Lambo");
        doorProperties.put(CarPropertyEnum.PRICE.toString(), 300L);

        Map<String, Object> carProperties = Maps.newHashMap();
        carProperties.put(CarPropertyEnum.MODEL.toString(), "300SL");
        carProperties.put(CarPropertyEnum.PRICE.toString(), 10000L);
        carProperties.put(CarPropertyEnum.PARTS.toString(), Lists.newArrayList(wheelProperties, doorProperties));


        Car car = new Car(carProperties);

        System.out.println("Here is our car:");
        System.out.println("-> model: "+ car.getModel().orElseThrow(()-> new IllegalArgumentException("model not exist")));
        System.out.println("-> price: "+ car.getPrice().orElseThrow(()-> new IllegalArgumentException("price not exist")));
        System.out.println("-> parts: ");
        car.getParts().forEach(p -> System.out.println(
            p.getType().orElse(null) + ": " +
            p.getModel().orElse(null)  + ": " +
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
