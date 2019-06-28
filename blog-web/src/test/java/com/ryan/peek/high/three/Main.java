package com.ryan.peek.high.three;

import java.lang.reflect.Method;

/**
 * @Classname Main
 * @Description TODO
 * @Date 2019/6/28 9:54
 * @Created by fyc
 */
public class Main {

    public static void main(String[] args) throws NoSuchMethodException {

        Travel travel = new Travel();
        Method bus = travel.getClass().getMethod("bus");
        TravelListener listener = new TravelListener();
        listener.addEvent(EventType.BUS, travel, bus);
        listener.onSubway(EventType.BUS);

    }

}