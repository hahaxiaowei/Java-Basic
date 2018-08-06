package cn.edu.hfut.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by SunWei
 * Date: 2018-08-06
 */
public class GamePlayerInvocationHandler implements InvocationHandler {

    //被代理的对象
    private Object object;

    //将需要代理的实例通过处理器类的构造方法传递给代理
    public GamePlayerInvocationHandler(Object object) {
        this.object = object;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        if ("login".equalsIgnoreCase(method.getName())) {
            System.out.printf("代理登陆游戏");
            result = method.invoke(this.object, args);
            return result;
        }
        result = method.invoke(this.object, args);
        return result;
    }
}
