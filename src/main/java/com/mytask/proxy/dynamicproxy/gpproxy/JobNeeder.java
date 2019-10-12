package com.mytask.proxy.dynamicproxy.gpproxy;

import com.mytask.proxy.Person;

/**
 * 工程名:pattern-proxy
 * 包名:com.mytask.proxy.dynamicproxy.gpproxy
 * 文件名:JobNeeder
 * description:
 *
 * @author lcwen
 * @version V1.0: JobNeeder.java 2019/10/12 14:53
 **/
public class JobNeeder implements Person {
    @Override
    public void findJob() {
        System.out.println("工资高、有美女老板");
    }
}
