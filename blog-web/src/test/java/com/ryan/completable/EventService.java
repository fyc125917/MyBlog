package com.ryan.completable;

/**
 * @Classname EventService
 * @Description TODO
 * @Date 2019/7/18 15:20
 * @Created by fyc
 */
public class EventService {

    public void listenOrderCancle(String order) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("order cancled no reason !!!");
    }

}