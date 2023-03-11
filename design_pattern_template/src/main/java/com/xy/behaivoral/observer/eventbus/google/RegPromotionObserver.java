package com.xy.behaivoral.observer.eventbus.google;

import com.google.common.eventbus.Subscribe;

/**
 * @author xiaoyi
 * Created on 2023/3/11.
 */
public class RegPromotionObserver {

    @Subscribe
    public void handler(Object event) {
        System.out.println("RegPromotionObserver handler ..., event: "+ event.toString());
    }
}