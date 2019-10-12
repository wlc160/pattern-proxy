package com.mytask.proxy.dynamicproxy.gpproxy;

import java.lang.reflect.Method;

/**
 * 工程名:pattern-proxy
 * 包名:com.mytask.proxy.dynamicproxy.gpproxy
 * 文件名:GPProxyTest
 * description:
 *
 * @author lcwen
 * @version V1.0: GPProxyTest.java 2019/10/12 14:52
 **/
public class GPProxyTest {

    public static void main(String[] args) {
        try {
            Object obj = new GPLietou().getInstant(new JobNeeder());
            Method method = obj.getClass().getMethod("findJob", null);
            method.invoke(obj);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
