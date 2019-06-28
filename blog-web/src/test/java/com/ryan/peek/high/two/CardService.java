package com.ryan.peek.high.two;

/**
 * @Classname CardService
 * @Description TODO
 * @Date 2019/6/27 17:29
 * @Created by fyc
 */
public class CardService {

    public void openCard(Event event){
        System.out.println("开卡服务 ：" + event);
    }

    public void charge(Event event) {
        System.out.println("充值服务 ：" + event);
    }


}