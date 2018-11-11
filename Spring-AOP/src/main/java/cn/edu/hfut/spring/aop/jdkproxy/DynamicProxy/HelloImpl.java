package cn.edu.hfut.spring.aop.jdkproxy.DynamicProxy;

public class HelloImpl implements Ihello {

    @Override
    public void sayHello() {
        System.out.println("hello china");
    }

    @Override
    public void sayBye() {
        System.out.println("bye bye ");
    }
}
