package com.xy.behaivoral.observer;

/**
 * 观察者模式--Subject
 *
 * @author xiaoyi
 * Created on 2023/3/11.
 */
public interface Subject<T extends Observer, V extends Event> {

    /**
     * register observer to subject
     *
     * @param observer
     */
    void register(T observer);

    /**
     * remove observer from subject
     *
     * @param observer
     */
    void remove(T observer);

    /**
     * notify observer happen event
     *
     * @param event
     */
    void notify(V event);
}
