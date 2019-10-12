package com.mytask.proxy.dynamicproxy.jdkproxy;

import java.lang.reflect.Method;

/**
 * 工程名:pattern-proxy
 * 包名:com.mytask.proxy.jdkproxy
 * 文件名:JDKProxyTest
 * description:
 *
 * @author lcwen
 * @version V1.0: JDKProxyTest.java 2019/10/12 14:05
 **/
public class JDKProxyTest {


    public static void main(String[] args) {
        try {
            Object obj = new JDKLietou().getInstant(new JobHunter());
            Method method = obj.getClass().getMethod("findJob", null);
            method.invoke(obj);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
