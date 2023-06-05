package com.ryan.daily.numberFormat;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * @ClassName NumberFormatHandler
 * @Description TODO
 * @Author fengyc
 * @Date 2023/6/5
 * @Version 1.0
 **/
public class NumberFormatHandler {

    public static <T> void format(T t) {
        //获取对象中的所有属性
        Field[] fields = t.getClass().getDeclaredFields();
        //循环并获取属性上的注解，根据注解进行处理
        for (Field field : fields) {
            //设置可见性
            field.setAccessible(true);
            NumberFormat attrs = field.getAnnotation(NumberFormat.class);
            if (Objects.isNull(attrs)) {
                continue;
            }
            try {
                Object value  = field.get(t);
                //转换类型
                NumberType type = attrs.type();
                //小数位数
                int scale = attrs.scale();
                //尾数处理方式
                RoundMode roundMode = attrs.roundRound();
                //钱币转换  起
                NumberType.MoneyType from = attrs.from();
                //钱币转换  去
                NumberType.MoneyType to = attrs.to();

                switch (type) {
                    //处理精度  保留小数位数
                    case ACCURACY:
                        BigDecimal bigDecimal = ((BigDecimal) value).setScale(2);
                        field.set(t, bigDecimal);
                        break;
                    //钱币单位转换
                    case MONEY:
                        ((BigDecimal) value).divide(BigDecimal.valueOf(1000)).setScale(2);
                        break;
                    //百分比
                    case PERCENTAGE:
                        // TODO 此处根据需要进行处理即可
                        break;
                    //千分比
                    case PERMILLAGE:

                        break;
                    default:
                        break;
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }




}
