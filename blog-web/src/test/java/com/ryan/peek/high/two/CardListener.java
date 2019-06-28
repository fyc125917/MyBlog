package com.ryan.peek.high.two;

/**
 * @Classname CardListener
 * @Description TODO
 * @Date 2019/6/27 17:31
 * @Created by fyc
 */
public class CardListener extends Listener {

    public void openCard(EventType type) {
        System.out.println("kaika ................");
        super.trigger(type);
    }

    public void charge(EventType type) {
        System.out.println("chongzhi ....................");
        super.trigger(type);
    }

}