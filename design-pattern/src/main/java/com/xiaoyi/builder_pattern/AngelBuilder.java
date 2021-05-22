package com.xiaoyi.builder_pattern;

/**
 * Created on 2021/2/23.
 *
 * @author 小逸
 * @description
 */
public class AngelBuilder extends ActorBuilder {
    @Override
    public void buildType() {
        actor.setType("天使");
    }

    @Override
    public void buildSex() {
        actor.setSex("女");
    }

    @Override
    public void buildFace() {
        actor.setFace("漂亮");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("白裙");
    }

    @Override
    public void buildHairstyle() {
        actor.setHairstyle("长发");
    }
}
