package com.ryan.peek.low;

/**
 * @Classname Main
 * @Description TODO
 * @Date 2019/6/25 18:16
 * @Created by fyc
 */
public class Main {

    public static void main(String[] args) {

        Subject subject = new Subject();
        new HexaObserver(subject);
        new OtcalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First value is change 15 " );
        subject.setState(15);
        System.out.println("Second value is change 10 ");
        subject.setState(10);

    }

}