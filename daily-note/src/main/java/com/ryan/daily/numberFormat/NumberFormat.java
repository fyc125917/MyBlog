package com.ryan.daily.numberFormat;

public @interface NumberFormat {

    //转换类型
    NumberType type() default NumberType.ACCURACY;
    //保留小数位数
    int scale() default 2;
    //钱单位转换 起
    NumberType.MoneyType from() default NumberType.MoneyType.DEFAULT;
    //钱单位转换 去
    NumberType.MoneyType to() default NumberType.MoneyType.DEFAULT;
    //入舍规则  默认四射侮辱
    RoundMode roundRound() default RoundMode.HALF_UP;

}
