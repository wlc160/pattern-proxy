package com.mytask.proxy.dynamicproxy.gpproxy;

import java.lang.reflect.Method;

/**
 * Created by lcwen on 2019/10/12.
 */
public interface GPInvocationHandler {

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable;

}
