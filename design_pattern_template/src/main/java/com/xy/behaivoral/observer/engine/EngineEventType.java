package com.xy.behaivoral.observer.engine;

import com.xy.behaivoral.observer.engine.impl.SchedulerThreadConfChangeListener;

/**
 * 引擎事件
 *
 * @author xiaoyi
 * Created on 2023/3/11.
 */
public enum EngineEventType {


    /**
     * 智能调度线程池参数变更事件
     */
    SchedulerThreadConfChangeEvent(SchedulerThreadConfChangeListener.class),

    ;

    private Class<? extends AbstractEngineEventListener> listener;

    EngineEventType(Class<? extends AbstractEngineEventListener> listener) {
        this.listener = listener;
    }

    public Class<? extends AbstractEngineEventListener> getListener() {
        return listener;
    }
}
