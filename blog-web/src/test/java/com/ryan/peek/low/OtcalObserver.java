package com.ryan.peek.low;

/**
 * @Classname OtcalObserver
 * @Description TODO
 * @Date 2019/6/25 18:15
 * @Created by fyc
 */
public class OtcalObserver extends Observer {

    public OtcalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attatch(this);
    }

    @Override
    public void update() {
        System.out.println("Otcal String is :" +  Integer.toOctalString(this.subject.getState()));
    }
}