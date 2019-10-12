package com.mytask.proxy.staticproxy;

import com.mytask.proxy.Person;

/**
 * 工程名:pattern-proxy
 * 包名:com.mytask.proxy.staticproxy
 * 文件名:Son
 * description:
 *
 * @author lcwen
 * @version V1.0: Son.java 2019/10/12 11:22
 **/
public class Son implements Person {

    @Override
    public void findJob() {
        System.out.println("福利好,双休,工资高");
    }
}
