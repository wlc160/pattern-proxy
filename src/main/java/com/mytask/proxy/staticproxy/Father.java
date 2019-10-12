package com.mytask.proxy.staticproxy;

/**
 * 工程名:pattern-proxy
 * 包名:com.mytask.proxy.staticproxy
 * 文件名:Father
 * description:
 *
 * @author lcwen
 * @version V1.0: Father.java 2019/10/12 11:23
 **/
public class Father {

    private Son son;

    public Father(Son son){
        this.son = son;
    }

    public void findJob(){
        System.out.println("确认要求，开始找工作。。。");
        son.findJob();
        System.out.println("面试。。。");
    }


}
