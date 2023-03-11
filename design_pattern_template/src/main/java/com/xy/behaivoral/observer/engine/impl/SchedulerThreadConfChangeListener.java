package com.xy.behaivoral.observer.engine.impl;

import com.xy.behaivoral.observer.Event;
import com.xy.behaivoral.observer.engine.AbstractEngineEventListener;
import com.xy.behaivoral.observer.engine.EngineEventType;

/**
 * @author xiaoyi
 * Created on 2023/3/11.
 */
public class SchedulerThreadConfChangeListener implements AbstractEngineEventListener {
    @Override
    public void handler(Event event) {
        System.out.println("engine SchedulerThreadConfChangeEvent event handler success");
    }

    @Override
    public EngineEventType getEventType() {
        return EngineEventType.SchedulerThreadConfChangeEvent;
    }
}
