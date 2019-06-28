package com.ryan.peek.high.one;

import java.lang.reflect.Method;

/**
 * @Classname Event
 * @Description TODO
 * @Date 2019/6/27 16:12
 * @Created by fyc
 */
public class Event {
    //事件源
    private Object source;
    //出发类型
    private String trigger;
    //执行的目标对象
    private Object target;
    //执行目标对象的方法
    private Method callBack;
    //触发时间
    private long time;

    public Event(Object target, Method callBack) {
        this.target = target;
        this.callBack = callBack;
    }

    public Object getSource() {
        return source;
    }

    public Event setSource(Object source) {
        this.source = source;
        return this;
    }

    public String getTrigger() {
        return trigger;
    }

    public Event setTrigger(String trigger) {
        this.trigger = trigger;
        return this;
    }

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    public Method getCallBack() {
        return callBack;
    }

    public void setCallBack(Method callBack) {
        this.callBack = callBack;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Event{" +
                "source=" + source +
                ", trigger='" + trigger + '\'' +
                ", target=" + target +
                ", callBack=" + callBack +
                ", time=" + time +
                '}';
    }
}