package com.ryan.daily.dailyTest;

import cn.hutool.bloomfilter.bitMap.BitMap;
import cn.hutool.bloomfilter.bitMap.LongMap;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName ForEach
 * @Description TODO
 * @Author fengyc
 * @Date 2023/5/26
 * @Version 1.0
 **/
public class ForEach {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(10);
//        for (Integer i = 0; i <0x7fffffff+1; i++) {
//            System.out.println(i                 );
//            int finalI = i;
//            executorService.submit(() -> {
//                try {
//                    Thread.sleep(10000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            });
//        }

        System.out.println(Integer.MAX_VALUE+1);
        System.out.println(Integer.MIN_VALUE);

    }


}
