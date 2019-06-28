package com.ryan.peek.high.three;

/**
 * @Classname TravelListener
 * @Description TODO
 * @Date 2019/6/28 9:52
 * @Created by fyc
 */
public class TravelListener implements Listener {

    public void onBus(EventType type) {
        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        this.trigger(type);
    }

    public void onSubway(EventType type) {
        System.out.println("111111111111111111111111111111111111");
        this.trigger(type);
    }

}