package com.ryan.peek.high.two;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @Classname Listener
 * @Description TODO
 * @Date 2019/6/27 17:20
 * @Created by fyc
 */
public abstract class Listener {

    Map<EventType,Event> map = new HashMap<>();

    public void addListener(EventType type, Object target, Method method) {
        Event event = new Event(target, method);
        map.put(type, event);
    }

    public void remove(EventType type) {
        map.remove(type);
    }

    public void trigger(Event event) {
        event.setSource(this);
        event.setTime(System.currentTimeMillis());
        try {
            event.getMethod().invoke(event.getTarget(), event);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public void trigger(EventType type) {
        if (!map.containsKey(type)) {
            return;
        }
        trigger(map.get(type));
    }

}