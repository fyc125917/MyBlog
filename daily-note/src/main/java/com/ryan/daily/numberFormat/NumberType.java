package com.ryan.daily.numberFormat;

public enum NumberType {
    //精度
    ACCURACY,
    //百分比
    PERCENTAGE,
    //千分比
    PERMILLAGE,
    //钱单位转换
    MONEY;

    enum MoneyType {
        //默认值
        DEFAULT,
        //单位格式化 万元
        WANYUAN,
        //千元
        QIANYUAN,
        //单位格式化  元
        YUAN,
        //分
        FEN;
    }


}
