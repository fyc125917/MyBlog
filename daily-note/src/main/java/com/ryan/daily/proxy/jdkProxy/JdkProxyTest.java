package com.ryan.daily.proxy.jdkProxy;

import com.ryan.daily.proxy.IUserDAO;
import com.ryan.daily.proxy.UserDAOImpl;

import java.lang.reflect.Proxy;

/**
 * @ClassName JdkProxyTest
 * @Description TODO
 * @Author fengyc
 * @Date 2023/5/24
 * @Version 1.0
 **/
public class JdkProxyTest {

    public static void main(String[] args) {
        //此处演示的Jdk动态代理，其最终是由被代理对象去执行的对应的方法。
        IUserDAO iUserDAO = (IUserDAO) Proxy.newProxyInstance(JdkProxyTest.class.getClassLoader(),
                new Class[]{IUserDAO.class}, new JdkProxy<>(UserDAOImpl.class));
        String login = iUserDAO.login();
        System.out.println(login);

    }


}
