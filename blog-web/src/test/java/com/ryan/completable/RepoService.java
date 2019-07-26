package com.ryan.completable;

import java.util.Map;

/**
 * @Classname RepoService
 * @Description TODO
 * @Date 2019/7/18 15:24
 * @Created by fyc
 */
public class RepoService {


    public Avaliability isAvaliability(String repo) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        final Avaliability avaliability = new Avaliability(repo, Math.random() * 5 != 0);
        System.out.println("Repo  is " + repo + ":" + avaliability.avaliability );
        return avaliability;
    }



    public static class Avaliability {
        String repo;
        boolean avaliability;

        public Avaliability(String repo, boolean avaliability) {
            this.repo = repo;
            this.avaliability = avaliability;
        }
    }

}