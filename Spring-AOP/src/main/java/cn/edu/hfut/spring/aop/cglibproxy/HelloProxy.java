package cn.edu.hfut.spring.aop.cglibproxy;

import org.apache.log4j.Logger;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class HelloProxy implements MethodInterceptor {

    private Logger logger = Logger.getLogger(HelloProxy.class);

    private Object source;

    public Object bind(Object source){
        this.source = source;
        //创建加强器，用来创建动态代理类
        Enhancer enhancer = new Enhancer();
        //向创建器中传入要代理的类
        enhancer.setSuperclass(this.source.getClass());
        //设置回调：对于代理类上所有的方法的调用，都会调用callBack,而callBack则需要实现intercept()方法
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        logger.info("方法调用之前，添加日志");
        methodProxy.invokeSuper(o,objects);
        logger.info("方法调用之后，添加日志");
        return null;
    }


    public static void main(String[] args) {
        Ihello ihello = (Ihello) new HelloProxy().bind(new Hello());
        System.out.println(ihello.getClass().getName());
        ihello.hello();
    }
}
