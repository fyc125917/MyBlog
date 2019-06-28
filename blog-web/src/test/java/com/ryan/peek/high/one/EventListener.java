package com.ryan.peek.high.one;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @Classname EventListener
 * @Description TODO
 * @Date 2019/6/27 16:18
 * @Created by fyc
 */
public abstract class EventListener {

    Map<EventType,Event> events = new HashMap<>();

    public void addEvent(EventType e, Object o, Method m) {
        Event event = new Event(o,m);
        events.put(e, event);
    }

    public void removeEvent(EventType eventType) {
        events.remove(eventType);
    }

    public void trigger(Event event) {
        event.setSource(this);
        event.setTime(System.currentTimeMillis());
        try {
            event.getCallBack().invoke(event.getTarget(), event);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public void trigger(EventType eventType) {
        if (!events.containsKey(eventType)) {
            return;
        }
        trigger(events.get(eventType).setTrigger(eventType.toString()));
    }

}