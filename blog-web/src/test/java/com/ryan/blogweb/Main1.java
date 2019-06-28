package com.ryan.blogweb;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @Classname Main1
 * @Description TODO
 * @Date 2019/5/29 15:30
 * @Created by fyc
 */
public class Main1 {

    public static void main(String[] args) throws ParseException {


        Integer a = 3;
        AAA aa = new AAA();


//        System.out.println(1 == aa.getDate());

        Map<String,Integer> map = new HashMap<>();
        map.put("s",null);
        Integer s = map.get("s");
        System.out.println(s instanceof Integer);
        System.out.println(1 == map.get("s"));

//        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
//
//        Date dueDate = s.parse("2019-05-11");
//        Date effectiveDate = s.parse("2018-05-12");
//        Integer policyYear = getPolicyYear(dueDate, effectiveDate);
//        System.out.println(policyYear);

    }

    private static Integer getPolicyYear(Date dueDate, Date effectiveDate) {
        Calendar startCalendar = Calendar.getInstance();
        Calendar endCalendar = Calendar.getInstance();
        startCalendar.setTime(effectiveDate);
        endCalendar.setTime(dueDate);
        if (endCalendar.compareTo(startCalendar) < 0) {
            System.out.println("应收日期小于保单生效日期，年度默认1");
            return 1;
        }
        int day = endCalendar.get(Calendar.DAY_OF_MONTH)
                - startCalendar.get(Calendar.DAY_OF_MONTH);
        int month = endCalendar.get(Calendar.MONTH)
                - startCalendar.get(Calendar.MONTH);
        int year = endCalendar.get(Calendar.YEAR)
                - startCalendar.get(Calendar.YEAR);
        if (day < 0) {
            month--;
        }
        if (month < 0) {
            month += 12;
            year--;
        }

        return year+1;
    }

}