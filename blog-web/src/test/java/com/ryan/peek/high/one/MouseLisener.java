package com.ryan.peek.high.one;

/**
 * @Classname MouseLitener
 * @Description TODO
 * @Date 2019/6/27 16:27
 * @Created by fyc
 */
public class MouseLisener extends EventListener {

    public void onClick() {
        System.out.println("单击事件！");
        this.trigger(EventType.ON_CLICK);
    }

    public void DBClick() {
        System.out.println("双击时间！");
        this.trigger(EventType.DB_CLICK);
    }



}