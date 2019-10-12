package com.mytask.proxy.dynamicproxy.cglibproxy;


import net.sf.cglib.core.DebuggingClassWriter;

/**
 * 工程名:pattern-proxy
 * 包名:com.mytask.proxy.dynamicproxy.cglibproxy
 * 文件名:CGlibProxyTest
 * description:
 *
 * @author lcwen
 * @version V1.0: CGlibProxyTest.java 2019/10/12 14:29
 **/
public class CGlibProxyTest {

    public static void main(String[] args) {

        //JDK是采用读取接口的信息
        //CGLib覆盖父类方法
        //目的：都是生成一个新的类，去实现增强代码逻辑的功能

        //JDK Proxy 对于用户而言，必须要有一个接口实现，目标类相对来说复杂
        //CGLib 可以代理任意一个普通的类，没有任何要求

        //CGLib 生成代理逻辑更复杂，效率,调用效率更高，生成一个包含了所有的逻辑的FastClass，不再需要反射调用
        //JDK Proxy生成代理的逻辑简单，执行效率相对要低，每次都要反射动态调用

        //CGLib 有个坑，CGLib不能代理final的方法

        try {
            JobSeeker seeker =  (JobSeeker)new CGlibLietou().getInstant(JobSeeker.class);
            seeker.findJob();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
