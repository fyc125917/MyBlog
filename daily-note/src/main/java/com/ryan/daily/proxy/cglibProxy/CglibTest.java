package com.ryan.daily.proxy.cglibProxy;

import com.ryan.daily.proxy.UserDAOImpl;
import com.ryan.daily.proxy.IUserDAO;

/**
 * @ClassName CglibTest
 * @Description TODO
 * @Author fengyc
 * @Date 2023/5/24
 * @Version 1.0
 **/
public class CglibTest {

    public static void main(String[] args) {

        CglibProxy<UserDAOImpl> cglibProxy = new CglibProxy<>();
        UserDAOImpl user = cglibProxy.getProxy(new UserDAOImpl());
        user.login();

        CglibProxy<IUserDAO> cglibProxy1 = new CglibProxy<>();
        IUserDAO user1 = cglibProxy1.getProxy(UserDAOImpl.class);
        user1.login();

    }

}
