package com.ryan.daily.proxy;

/**
 * @ClassName UserImpl
 * @Description TODO
 * @Author fengyc
 * @Date 2023/5/24
 * @Version 1.0
 **/
public class UserDAOImpl implements IUserDAO {
    @Override
    public String login() {
        System.out.println("用户登录成功");
        return "";
    }
}
