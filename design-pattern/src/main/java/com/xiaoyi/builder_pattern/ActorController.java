package com.xiaoyi.builder_pattern;

/**
 * Created on 2021/2/23.
 *
 * @author 小逸
 * @description Director 指挥者
 */
public class ActorController {

    public Actor construct(ActorBuilder ab){
        Actor actor;
        ab.buildType();
        ab.buildSex();
        ab.buildFace();
        ab.buildCostume();
        if (!ab.isBareheaded()){
            ab.buildHairstyle();
        }


        actor=ab.createActor();
        return actor;
    }
}
