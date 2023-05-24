package com.ryan.daily.proxy.cglibProxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @ClassName Proxy
 * @Description TODO
 * @Author fengyc
 * @Date 2023/5/24
 * @Version 1.0
 **/
public class CglibProxy<T> implements MethodInterceptor {

    private T target;

    public T getProxy(T t) {
        this.target = t;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(t.getClass());
        enhancer.setCallback(this);
        return (T) enhancer.create();
    }

    public T getProxy(Class<? extends T> clz) {
        try {
            this.target = clz.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clz);
        enhancer.setCallback(this);
        return (T) enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        if (this.isDefaultMethod(method)) {
            return o;
        }
        if (Object.class.equals(method.getDeclaringClass())) {
           return method.invoke(this, objects);
        }
        System.out.println("aaaaaaaaaaaaaaaaaaaaa");
        method.invoke(target, objects);
        System.out.println("bbbbbbbbbbbbbbbbbbbbb");
        return null;
    }

    private boolean isDefaultMethod(Method method) {
        return (method.getModifiers() & 1033) == 1 && method.getDeclaringClass().isInterface();
    }
}
