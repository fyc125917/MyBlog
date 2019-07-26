package com.ryan.blogweb;

import com.ryan.blogweb.controller.UserController;
import org.springframework.beans.BeanUtils;

import java.lang.reflect.Constructor;

/**
 * @Classname Main
 * @Description TODO
 * @Date 2019/5/27 17:02
 * @Created by fyc
 */
public class Main {
    public static void main(String[] args) throws InterruptedException, ClassNotFoundException, NoSuchMethodException {

//        Class<UserController> userController = (Class<UserController>) Class.forName("com.ryan.blogweb.controller.UserController");
//        Constructor<UserController> declaredConstructor = userController.getDeclaredConstructor(UserController.class);
//        UserController userController1 = BeanUtils.instantiateClass(declaredConstructor, args);
//        System.out.println(userController1);

//        int i1 = Integer.valueOf(5).compareTo(null);
//        System.out.println(i1);

        int i2 = Integer.valueOf(0).compareTo(-8);
        System.out.println(i2);

        System.out.println(Integer.valueOf(0).compareTo(0));

        System.out.println(Integer.valueOf(0).compareTo(5));

//        for (int i = 0; i < 10; i++) {
//            if (i==3) {
//                return;
//            }
//            System.out.println(i);
//
//        }
//        System.out.println("aaaaaaaaaaaaaaaa");
//        AAA A = new AAA(1,"ZC");
//        Thread.sleep(5000);
//        AAA AA = new AAA(1,"BC");
//        Thread.sleep(5000);
//        AAA AAAa = new AAA(3,"CX");
//
//        List<AAA> list = new ArrayList<>();
//
//        list.add(A);
//        list.add(AA);
//        list.add(AAAa);
//
//        Collections.sort(list, Comparator.comparing(AAA::getDate).thenComparing(AAA::getFlag));
//
//        System.out.println(list.toString());
//        list.stream()
//                .collect(Collectors.groupingBy(AAA::getDate));


//        LocalDate origin = LocalDate.of(2019, 05, 27);
//        LocalDate changeTo = LocalDate.of(2020, 05, 29);
//
//        //2019-05-16
//        LocalDate feild = LocalDate.of(2019, 05, 27);
//
//
//        Period period = Period.between(origin, changeTo);
//        int years = period.getYears();
//        int months = period.getMonths();
//        int days = period.getDays();
//        //当前处理的属性
//        LocalDate localDate = feild.plusYears(years).plusMonths(months).plusDays(days);
//        String format = localDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
//        System.out.println(format);
    }

}