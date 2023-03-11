package com.xy.behaivoral.observer;

/**
 * 观察者模式--Observer
 *
 * @author xiaoyi
 * Created on 2023/3/11.
 */
public interface Observer {

    /**
     * handler event
     *
     * @param event
     */
    void handler(Event event);
}
