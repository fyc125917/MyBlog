package com.ryan.daily.proxy.mybatisProxy;

import com.ryan.daily.proxy.IUserDAO;

import java.lang.reflect.Proxy;

/**
 * @ClassName MybatisProxyTest
 * @Description TODO
 * @Author fengyc
 * @Date 2023/5/24
 * @Version 1.0
 **/
public class MybatisProxyTest {

    public static void main(String[] args) {
        IUserDAO iUserDAO = (IUserDAO) Proxy.newProxyInstance(MybatisProxyTest.class.getClassLoader(), new Class[]{IUserDAO.class}, new MapperProxy());
        String login = iUserDAO.login();
        //此处的login可以理解成sqlSession执行结束后，返回的SQL的操作结果
        System.out.println(login);

    }
}
