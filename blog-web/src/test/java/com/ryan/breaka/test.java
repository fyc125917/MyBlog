package com.ryan.breaka;

/**
 * @Classname test
 * @Description TODO
 * @Date 2019/6/27 15:31
 * @Created by fyc
 */
public class test {

    public static void main(String[] args) {

        out: for (int i = 0; i < 10; i++) {
            System.out.println("outer : " + i);
            for (int i1 = 0; i1 < 10; i1++) {
                if (i1 == 5) {
                    System.out.println("inner ：" + i1);
                    break out;
                }
            }
        }
    }

}