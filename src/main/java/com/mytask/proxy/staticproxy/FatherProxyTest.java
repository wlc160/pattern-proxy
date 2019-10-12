package com.mytask.proxy.staticproxy;

/**
 * 工程名:pattern-proxy
 * 包名:com.mytask.proxy.staticproxy
 * 文件名:FatherProxyTest
 * description:
 *
 * @author lcwen
 * @version V1.0: FatherProxyTest.java 2019/10/12 11:29
 **/
public class FatherProxyTest {

    public static void main(String[] args) {
        Father father = new Father(new Son());
        father.findJob();
    }

}
