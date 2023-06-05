package com.ryan.daily.genericity;


/**
 * @ClassName ConverWapper
 * @Description TODO
 * @Author fengyc
 * @Date 2023/5/31
 * @Version 1.0
 **/
public class ConverWapper<T,S> {

    Convert<T,S> convert;

    T convert(Convert<T, S> convert,S source) {
        T convert1 = convert.convert(source);
        return convert1;
    }


}
