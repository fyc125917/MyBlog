package com.ryan.peek.low;

/**
 * @Classname HexaObserver
 * @Description TODO
 * @Date 2019/6/25 18:13
 * @Created by fyc
 */
public class HexaObserver extends Observer {

    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attatch(this);
    }

    @Override
    public void update() {
        System.out.println("Hexa String is :" + Integer.toHexString(this.subject.getState()));
    }
}