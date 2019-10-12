**设计模式之代理模式**

**1、定义：**
指为其他对象提供一种代理，以控制对这个对象的访问。代理对象在客服端和目标对象之间起到中介作用，代理模式属于结构型设计模式。

**2、使用目的：**
保护和增强目标对象

**3、分类：**
静态代理和动态代理

**4、静态代理和动态的本质区别：**

（1）静态代理只能通过手动完成代理操作，如果被代理类增加新的方法，代理类需要同步新增，违背开闭原则。

（2）动态代理采用在运行时动态生成代码的方式，取消了对被代理类的扩展限制，遵循开闭原则。

（3）若动态代理要对目标类的增强逻辑扩展，结合策略模式，只需新增策略类便可完成，无需修改代理类的代码。

**5、优点：**

（1）代理模式能将代理对象与真实被调用的目标对象分离

（2）一定程度上降低了系统耦合度，扩展性好

（3）可以起到保护目标对象的作用

（4）可以对目标对象的功能增强

**6、缺点**

（1）会增加系统设计中类的数量

（2）在客户端和目标对象增加一个代理对象，会造成请求处理速度变慢。

（3）增加系统复杂度

**7、CGLib 和 JDK 动态代理对比**

（1）JDK 动态代理是实现了被代理对象的接口，CGLib 是继承了被代理对象。

（2）JDK和CGLib都是在运行期生成字节码，JDK是直接写Class字节码，CGLib使用ASM框架写Class字节码，Cglib代理实现更复杂，生成代理类比JDK效率低。

（3）JDK调用代理方法，是通过反射机制调用，CGLib是通过FastClass机制直接调用方法，CGLib执行效率更高。

**8、代理模式在 Spring 源码中的应用**

（1）先看 ProxyFactoryBean 核心的方法就是 getObject()方法，以下源码：
 ````
 public Object getObject() throws BeansException {   
    initializeAdvisorChain();  
    if (isSingleton()) {
        return getSingletonInstance(); 
    }else { 
        if (this.targetName == null) { 
            logger.warn("Using non-singleton proxies with singleton targets is often undesirable. " 
            + "Enable prototype proxies by setting the 'targetName' property."); 
          }return newPrototypeInstance(); 
    } 
  }  
  
  
 在 getObject()方法中，主要调用 getSingletonInstance()和 newPrototypeInstance()； 
 在 Spring 的配置中，如果不做任何设置，那么 Spring 代理生成的 Bean 都是单例对象。 
 如果修改 scope 则每次创建一个新的原型对象。
 
  ````

（2）Spring 中的代理选择原则

①当 Bean有实现接口时，Spring就会用JDK的动态代理。

②当 Bean没有实现接口时，Spring选择CGLib。

③Spring可以通过配置强制使用CGLib，只需在Spring的配置文件中加入如下代码：

````
  <aop:aspectj-autoproxy proxy-target-class="true"/>
````
  














