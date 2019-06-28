package com.ryan.peek.low;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Subject
 * @Description TODO
 * @Date 2019/6/25 18:01
 * @Created by fyc
 */
public class Subject {

    private List<Observer> observers = new ArrayList<>();

    private Integer state;

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attatch(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}