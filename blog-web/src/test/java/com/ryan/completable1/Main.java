package com.ryan.completable1;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;
import com.sun.xml.internal.messaging.saaj.soap.ver1_1.Envelope1_1Impl;
import org.assertj.core.condition.Join;

import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

/**
 * @Classname Main
 * @Description TODO
 * @Date 2019/7/17 17:02
 * @Created by fyc
 */
public class Main {

    public static void main(String[] args) {

        List<Person> personList =
                Arrays.asList(new Person("xiaoming", 12, true),
                              new Person("xiaohong", 20, false),
                              new Person("xiaogang", 155, true));
        List<String> ss = new ArrayList<>();

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        List<CompletableFuture<Person>> collect = personList.stream().map(p ->
                CompletableFuture.supplyAsync(() -> delay(p,ss),executorService)
                        .whenComplete((p1, t) -> hasCompleteEach(p1, t,ss))
        ).collect(Collectors.toList());

        CompletableFuture<Void> voidCompletableFuture = CompletableFuture.allOf(collect.toArray(new CompletableFuture[collect.size()]))
                .whenCompleteAsync((p, t) -> {
                    hasCompleteAll(t, ss);
                    executorService.shutdown();
                });

        System.out.println("main方法结束！！！");
    }

    public static Person hasCompleteAll(Throwable t, List<String> ss){
        if (Objects.nonNull(t)) {
            System.out.println( t.getMessage() + "ALLLLLLL");;
        }
        System.out.println(ss.toString()+  "==========HAS COMPLETE!!!  hasCompleteAll");
        return new Person();
    }

    public static void hasCompleteEach(Person p, Throwable t, List<String> ss){
        if (Objects.nonNull(t)) {
            System.out.println(t.getMessage() + "EACHHHHHHHHHHHH");;
        }
        String x = p.toString() + "==========HAS COMPLETE!!!  hasCompleteEach";
        System.out.println(x);
        ss.add(x);
    }

    public static Person delay(Person person, List<String> ss) {
        ss.add(person.getAge() + ":" + person.getName());
        try {
            Thread.sleep((long) (Math.random() * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (false == person.isSex()) {
            throw new RuntimeException(person.getName() + " ====这个B有问题");
        }
//        System.out.println(person.toString());
        return person;
    }




}