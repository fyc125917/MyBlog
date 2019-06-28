package com.ryan.peek.low;

/**
 * @Classname Observer
 * @Description TODO
 * @Date 2019/6/25 18:01
 * @Created by fyc
 */
public abstract class Observer {

    protected Subject subject;

    public abstract void update();

}