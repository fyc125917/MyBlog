package com.ryan.daily.proxy.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @ClassName JdkProxy
 * @Description TODO
 * @Author fengyc
 * @Date 2023/5/24
 * @Version 1.0
 **/
public class JdkProxy<T,U> implements InvocationHandler {

    private Class<T> target;

    public JdkProxy(Class<T> target) {
        this.target = target;
    }

    @Override
    public U invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("JDK动态代理，执行前000000000000000");
        U u =(U) method.invoke(target.newInstance(), args);
        System.out.println("JDK动态代理，执行后111111111111111");
        return u;
    }
}
