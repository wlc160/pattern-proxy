package com.mytask.proxy.dynamicproxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 工程名:pattern-proxy
 * 包名:com.mytask.proxy.jdkproxy
 * 文件名:JDKLietou
 * description:
 *
 * @author lcwen
 * @version V1.0: JDKLietou.java 2019/10/12 11:56
 **/
public class JDKLietou implements InvocationHandler {

    public Object target;

    /**
     * 根据给定的目标对象生成一个新的代理目标对象
     * @param target
     * @return
     */
    public Object getInstant(Object target){
        this.target = target;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    private void after() {
        System.out.println("已确认工作，面试。。。。");
    }

    private void before() {
        System.out.println("确认工作需求，开始物色。。。");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object obj = method.invoke(this.target,args);
        after();
        return obj;
    }
}
