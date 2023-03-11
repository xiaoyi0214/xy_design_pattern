package com.xy.behaivoral.observer.engine;

import com.xy.behaivoral.observer.Observer;

/**
 * @author xiaoyi
 * Created on 2023/3/11.
 */
public interface AbstractEngineEventListener extends Observer {


    /**
     * get listener engine event type
     *
     * @return
     */
    EngineEventType getEventType();


}
