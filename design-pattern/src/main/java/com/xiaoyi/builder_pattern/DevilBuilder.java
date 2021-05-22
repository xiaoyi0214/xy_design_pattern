package com.xiaoyi.builder_pattern;

/**
 * Created on 2021/2/23.
 *
 * @author 小逸
 * @description
 */
public class DevilBuilder extends ActorBuilder {
    @Override
    public void buildType() {
        actor.setType("恶魔");
    }

    @Override
    public void buildSex() {
        actor.setSex("男");
    }

    @Override
    public void buildFace() {
        actor.setFace("丑");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("黑衣");
    }

    @Override
    public void buildHairstyle() {
        actor.setHairstyle("光头");
    }

    @Override
    public boolean isBareheaded() {
        return true;
    }
}
