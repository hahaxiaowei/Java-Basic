package cn.edu.hfut.spring.aop.cglibproxy;

public class Hello implements Ihello {

    @Override
    public void hello() {
        System.out.println("你好啊");
    }
}
