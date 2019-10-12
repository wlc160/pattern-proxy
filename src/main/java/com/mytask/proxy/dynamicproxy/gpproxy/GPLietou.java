package com.mytask.proxy.dynamicproxy.gpproxy;

import java.lang.reflect.Method;

/**
 * 工程名:pattern-proxy
 * 包名:com.mytask.proxy.dynamicproxy.gpproxy
 * 文件名:GPLietou
 * description:
 *
 * @author lcwen
 * @version V1.0: GPLietou.java 2019/10/12 14:48
 **/
public class GPLietou implements GPInvocationHandler {

    public Object target;

    public Object getInstant(Object target){
        this.target = target;
        Class<?> clazz = target.getClass();
        return GPProxy.newProxyInstance(new GPClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object obj = method.invoke(this.target, args);
        after();
        return obj;
    }

    private void after() {
        System.out.println("已确认工作，面试。。。。");
    }

    private void before() {
        System.out.println("确认工作需求，开始物色。。。");
    }

}
