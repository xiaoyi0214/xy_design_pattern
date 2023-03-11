package com.xy.behaivoral.observer.engine;

import com.xy.behaivoral.observer.Event;
import com.xy.behaivoral.observer.Observer;
import com.xy.behaivoral.observer.Subject;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Engine Event Emitter
 *
 * @author xiaoyi
 * Created on 2023/3/11.
 */
public class EngineEventEmitter implements Subject<AbstractEngineEventListener, EngineEvent> {

    private HashMap<EngineEventType, Set<AbstractEngineEventListener>> registered;

    public EngineEventEmitter() {
        registered = new HashMap<>(EngineEventType.values().length);
        for (EngineEventType eventType : EngineEventType.values()) {
            Set<AbstractEngineEventListener> listeners = new HashSet<>();
            Class<? extends AbstractEngineEventListener> listenerClass = eventType.getListener();
            try {
                AbstractEngineEventListener eventListener = listenerClass.newInstance();
                listeners.add(eventListener);
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            registered.put(eventType, listeners);
        }
    }


    @Override
    public void register(AbstractEngineEventListener listener) {
        if (registered.containsKey(listener.getEventType())) {
            Set<AbstractEngineEventListener> listeners = registered.get(listener.getEventType());
            listeners.add(listener);
        } else {
            HashSet<AbstractEngineEventListener> listeners = new HashSet<>();
            listeners.add(listener);
            registered.put(listener.getEventType(), listeners);
        }
    }

    @Override
    public void remove(AbstractEngineEventListener listener) {
        EngineEventType eventType = listener.getEventType();
        if (registered.containsKey(eventType)) {
            Set<AbstractEngineEventListener> listeners = registered.get(eventType);
            listeners.remove(listener);
        }
    }

    @Override
    public void notify(EngineEvent event) {
        EngineEventType eventType = event.getEventType();
        if (registered.containsKey(eventType)) {
            Set<AbstractEngineEventListener> listeners = registered.get(eventType);
            for (AbstractEngineEventListener listener : listeners) {
                listener.handler(event);
            }
        }
    }
}
