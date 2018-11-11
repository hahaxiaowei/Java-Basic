package cn.edu.hfut.spring.aop.jdkproxy.DynamicProxy;

import org.apache.log4j.Logger;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyHello implements InvocationHandler {

    private Logger logger = Logger.getLogger(ProxyHello.class);

    private Object source;

   public Object bind(Object source){
       this.source = source;
       return Proxy.newProxyInstance(this.getClass().getClassLoader(),this.source.getClass().getInterfaces(),this);
   }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        logger.debug("调用目标方法前切入，加入日志代码");
        method.invoke(this.source,args);
        logger.debug("调用目标方法后，切入，加入日志代码");
        return null;
    }

    public static void main(String[] args) {
        Ihello ihello = new HelloImpl();

        Ihello proxyInstance = (Ihello) new ProxyHello().bind(ihello);

        System.out.println(proxyInstance.getClass().getName());
        proxyInstance.sayHello();
        proxyInstance.sayBye();
    }
}
