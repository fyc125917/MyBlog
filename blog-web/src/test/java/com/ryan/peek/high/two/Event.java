package com.ryan.peek.high.two;

import java.lang.reflect.Method;

/**
 * @Classname Event
 * @Description TODO
 * @Date 2019/6/27 17:15
 * @Created by fyc
 */
public class Event {
    //谁在监听
    private Object source;
    //时间类型
    private String type;
    //执行谁的代码
    private Object target;
    //执行哪个方法
    private Method method;
    //执行时间
    private Long time;

    public Event(Object target, Method method) {
        this.target = target;
        this.method = method;
    }

    public Object getSource() {
        return source;
    }

    public Event setSource(Object source) {
        this.source = source;
        return this;
    }

    public String getType() {
        return type;
    }

    public Event setType(String type) {
        this.type = type;
        return this;
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

    @Override
    public String toString() {
        return "Event{" +
                "source=" + source +
                ", type='" + type + '\'' +
                ", target=" + target +
                ", method=" + method +
                ", time=" + time +
                '}';
    }
}