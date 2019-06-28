package com.ryan.peek.high.one;

import java.lang.reflect.Method;

/**
 * @Classname Main
 * @Description TODO
 * @Date 2019/6/27 16:32
 * @Created by fyc
 */
public class Main {

    public static void main(String[] args) throws NoSuchMethodException {

        MouseEventCallBack mouseEventCallBack = new MouseEventCallBack();
        Method onclick = mouseEventCallBack.getClass().getMethod("onclick", Event.class);
        MouseLisener m = new MouseLisener();
        m.addEvent(EventType.DB_CLICK,mouseEventCallBack,onclick);
        m.DBClick();
    }

}