package com.mytask.proxy.dynamicproxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 工程名:pattern-proxy
 * 包名:com.mytask.proxy.dynamicproxy.cglibproxy
 * 文件名:CGlibLietou
 * description:
 *
 * @author lcwen
 * @version V1.0: CGlibLietou.java 2019/10/12 14:22
 **/
public class CGlibLietou implements MethodInterceptor{

    public Object getInstant(Class<?> clazz){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        Object obj = methodProxy.invokeSuper(o,objects);
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
