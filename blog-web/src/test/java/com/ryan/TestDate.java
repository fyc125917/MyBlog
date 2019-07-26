package com.ryan;

//
import io.netty.util.internal.StringUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class TestDate {

    public static void main(String[] args) {
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy/MM/dd HH:mm:ss" );

//        String str = "2016/1/5 12:12:12";

        String wageMonth ="201812";
        Date current = parse(wageMonth, "yyyyMM");
        Date date = addMonth(current, 1);
        String nextMonth = toString(date, "yyyyMM");
        System.out.println(nextMonth);

        Runnable runnable = () -> wageMonth.trim();

//
//        try {
//            Date d = sdf.parse(str);
//            System.out.printf("字符串 %s 通过格式  yyyy/MM/dd HH:mm:ss %n转换为日期对象: %s",str,d.toString());
//        } catch (ParseException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }

    }

    public static Date parse(String str, String format) {
        try {
            SimpleDateFormat t = new SimpleDateFormat(format);
            return t.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Date addMonth(Date date, int count) {
		/* ${_ZVING_LICENSE_CODE_} */

        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.MONTH, count);
        return c.getTime();
    }

    public static String toString(Date date, String format) {
        SimpleDateFormat t = new SimpleDateFormat(format);
        return t.format(date);
    }



}