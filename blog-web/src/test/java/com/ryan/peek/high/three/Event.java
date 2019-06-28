package com.ryan.peek.high.three;

import java.lang.reflect.Method;

/**
 * @Classname Event
 * @Description TODO
 * @Date 2019/6/28 9:41
 * @Created by fyc
 */
public class Event {

    //谁触发
    private Object source;
    //事件类型
    private EventType type;
    //执行的类
    private Object target;
    //执行方法
    private Method method;

    private Long time;

    @Override
    public String toString() {
        return "Event{" +
                "source=" + source +
                ", type=" + type +
                ", target=" + target +
                ", method=" + method +
                ", time=" + time +
                '}';
    }

    public Event(Object target, Method method) {
        this.target = target;
        this.method = method;
    }

    public Object getSource() {
        return source;
    }

    public void setSource(Object source) {
        this.source = source;
    }

    public EventType getType() {
        return type;
    }

    public void setType(EventType type) {
        this.type = type;
    }

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    public Method getMethod() {
        return method;
    }

    public void setMethod(Method method) {
        this.method = method;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }
}