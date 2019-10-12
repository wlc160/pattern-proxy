package com.mytask.proxy.dynamicproxy.jdkproxy;

import com.mytask.proxy.Person;

/**
 * 工程名:pattern-proxy
 * 包名:com.mytask.proxy.jdkproxy
 * 文件名:JobHunter
 * description:
 *
 * @author lcwen
 * @version V1.0: JobHunter.java 2019/10/12 11:41
 **/
public class JobHunter implements Person{

    @Override
    public void findJob() {
        System.out.println("双休福利、工资高、美女多");
    }
}
