package com.xiaoyi.builder_pattern;

import com.xiaoyi.factory_method.XmlUtil;

/**
 * Created on 2021/2/23.
 *
 * @author 小逸
 * @description
 */
public class ActorClient {
    public static void main(String[] args) {
        ActorBuilder ab; //针对抽象建造者编程
        //反射生成具体建造者对象
//        ab = new AngelBuilder();
//        ab = new HeroBuilder();
        ab = new DevilBuilder();

        ActorController ac = new  ActorController();
        Actor actor;
        actor = ac.construct(ab); //通过指挥者创建完整的建造者对象

        String  type = actor.getType();
        System.out.println(type  + "的外观：");
        System.out.println("性别：" + actor.getSex());
        System.out.println("面容：" + actor.getFace());
        System.out.println("服装：" + actor.getCostume());
        System.out.println("发型：" + actor.getHairstyle());
    }

}
