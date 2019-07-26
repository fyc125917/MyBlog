package com.ryan.completable;

/**
 * @Classname Stock
 * @Description TODO
 * @Date 2019/7/18 16:05
 * @Created by fyc
 */
public class Stock {

    String repo;
    Integer count;

    public Stock(String repo, Integer count) {
        this.repo = repo;
        this.count = count;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "repo='" + repo + '\'' +
                ", count=" + count +
                '}';
    }
}