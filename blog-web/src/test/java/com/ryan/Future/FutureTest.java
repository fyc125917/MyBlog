package com.ryan.Future;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Classname FutureTest
 * @Description TODO
 * @Date 2019/6/19 13:24
 * @Created by fyc
 */
public class FutureTest {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        long l = System.currentTimeMillis();
        //开始等待外卖处理
        FutureTask<Chuju> waimai = new FutureTask<Chuju>(new MyFuture("waimai", 10000, new Chuju()));
        new Thread(waimai).start();
        //买菜
        Thread.sleep(1000);
        Cai cai = new Cai();

        if (!waimai.isDone()) {
            System.out.println("saddddddddddddddddd");
        }
        Chuju chuju = waimai.get();

        cook(chuju, cai);
        System.out.println("haoshi==========:"+(System.currentTimeMillis()-l));


    }

    static void cook(Chuju a, Cai cai) {

    }

}

class MyFuture<V> implements Callable<V> {
    String operate = "";
    long wait = 0;
    V v;

    public MyFuture(String operate, long wait, V v) {
        this.operate = operate;
        this.wait = wait;
        this.v = v;
    }

    @Override
    public V call() throws Exception {
        System.out.println("current is doing "  + operate);
        Thread.sleep(wait);
        return v;
    }
}

class Chuju {

}

class Cai {

}
