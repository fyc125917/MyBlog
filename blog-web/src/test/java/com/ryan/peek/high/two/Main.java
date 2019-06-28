package com.ryan.peek.high.two;

import java.lang.reflect.Method;

/**
 * @Classname Main
 * @Description TODO
 * @Date 2019/6/27 17:33
 * @Created by fyc
 */
public class Main {

    public static void main(String[] args) throws NoSuchMethodException {

        Method openCard = CardService.class.getMethod("openCard", Event.class);
        CardListener cardListener =  new CardListener();
        cardListener.addListener(EventType.OPEN_CARD,new CardService(),openCard);
        cardListener.openCard(EventType.OPEN_CARD);

    }


}