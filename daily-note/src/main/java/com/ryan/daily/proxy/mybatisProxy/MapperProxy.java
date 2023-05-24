package com.ryan.daily.proxy.mybatisProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @ClassName MapperProxy
 * @Description TODO
 * @Author fengyc
 * @Date 2023/5/24
 * @Version 1.0
 **/
public class MapperProxy implements InvocationHandler {

    public MapperProxy() {
        System.out.println("MapperProxy 初始化完成");
    }
    //mybatis 中，接口类主要作用在于给service层进行调用和映射xml文件中的SQL
    //最终在执行时，并没有用mapper接口对象调用对应的方法，而是将配置好的SQL，交给sqlSession进行执行的
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (Object.class.equals(method.getDeclaringClass())) {
            return method.invoke(this, args);
        }
        System.out.println("MapperProxy 执行前");

        return "这里由sqlSession执行对应的SQL";
    }
}
