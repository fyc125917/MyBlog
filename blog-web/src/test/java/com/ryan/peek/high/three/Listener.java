package com.ryan.peek.high.three;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @Classname Listener
 * @Description TODO
 * @Date 2019/6/28 9:45
 * @Created by fyc
 */
public interface Listener {

    Map<EventType,Event> events = new HashMap<>();

    default void addEvent(EventType type, Object target, Method method) {
        Event event = new Event(target,method);
        events.put(type, event);
    }

    default void removeEvent(Event event) {
        events.remove(event);
    }

    default void trigger(Event event) {
        event.setSource(this);
        event.setTime(System.currentTimeMillis());
        try {
            event.getMethod().invoke(event.getTarget());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    default void trigger(EventType type) {
        if (!events.containsKey(type)) {
            return;
        }
        trigger(events.get(type));
    }

}