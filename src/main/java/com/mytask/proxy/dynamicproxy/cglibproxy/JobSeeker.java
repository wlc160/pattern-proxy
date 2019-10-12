package com.mytask.proxy.dynamicproxy.cglibproxy;

import com.mytask.proxy.Person;

/**
 * 工程名:pattern-proxy
 * 包名:com.mytask.proxy.dynamicproxy.cglibproxy
 * 文件名:JobSeeker
 * description:
 *
 * @author lcwen
 * @version V1.0: JobSeeker.java 2019/10/12 14:23
 **/
public class JobSeeker implements Person {

    @Override
    public void findJob() {
        System.out.println("福利双休、靓女多、老板人好");
    }

}
