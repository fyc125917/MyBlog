package com.ryan.peek.high.one;

/**
 * @Classname MouseEventCallBack
 * @Description TODO
 * @Date 2019/6/27 16:31
 * @Created by fyc
 */
public class MouseEventCallBack {

    public void onclick(Event event) {
        System.out.println("=======触发鼠标单击事件========\n" + event);
    }

    public void dbclick(Event event) {
        System.out.println("=======触发鼠标双击事件========\n" + event);
    }

}