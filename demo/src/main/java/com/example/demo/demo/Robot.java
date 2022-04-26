package com.example.demo.demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Robot implements InvocationHandler {

    private Object object;

    public Robot(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("准备报时---");
        Object invoke = method.invoke(object, args);
        System.out.println("报时结束了---");

        return invoke;
    }

    // 生成代理对象
    public Object getProxy() {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Class<?>[] interfaces = object.getClass().getInterfaces();
        return Proxy.newProxyInstance(loader, interfaces, this);
    }

}
