package com.ryan.peek.low;

/**
 * @Classname BinaryObserver
 * @Description TODO
 * @Date 2019/6/25 18:09
 * @Created by fyc
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attatch(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String is :" + Integer.toBinaryString(this.subject.getState()));
    }
}