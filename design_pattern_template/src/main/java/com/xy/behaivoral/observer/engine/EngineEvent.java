package com.xy.behaivoral.observer.engine;

import com.xy.behaivoral.observer.Event;

/**
 * @author xiaoyi
 * Created on 2023/3/11.
 */
public interface EngineEvent extends Event {

    /**
     * get engine event type
     *
     * @return
     */
    EngineEventType getEventType();
}
