package com.ryan.daily.numberFormat;

import java.math.BigDecimal;

/**
 * @ClassName Order
 * @Description TODO
 * @Author fengyc
 * @Date 2023/6/5
 * @Version 1.0
 **/
public class Order {

    //数量
    @NumberFormat(type = NumberType.ACCURACY)
    private String count;
    //总价
    @NumberFormat(type = NumberType.MONEY,from = NumberType.MoneyType.FEN,to = NumberType.MoneyType.WANYUAN)
    private String sumPrice;
    //单价
    @NumberFormat(type = NumberType.MONEY,from = NumberType.MoneyType.FEN,to = NumberType.MoneyType.YUAN)
    private String perPrice;
    //时限
    @NumberFormat
    private String timeLimit;
    //买主
    private String buyer;
    //占比
    @NumberFormat(type = NumberType.PERCENTAGE)
    private String proportion;

}
