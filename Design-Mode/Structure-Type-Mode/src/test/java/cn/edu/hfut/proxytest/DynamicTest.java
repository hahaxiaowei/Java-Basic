package cn.edu.hfut.proxytest;

import cn.edu.hfut.proxy.dynamic.GamePlayer;
import cn.edu.hfut.proxy.dynamic.GamePlayerInvocationHandler;
import cn.edu.hfut.proxy.dynamic.IGamePlayer;
import junit.framework.TestCase;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by SunWei
 * Date: 2018-08-06
 */
public class DynamicTest extends TestCase {

    public void testDynamic() {
        IGamePlayer iGamePlayer = new GamePlayer("小明");
        InvocationHandler invocationHandler = new GamePlayerInvocationHandler(iGamePlayer);
        //获取被代理类的加载器
        ClassLoader classLoader = iGamePlayer.getClass().getClassLoader();
        Class<?>[] cls = new Class[]{IGamePlayer.class};

        IGamePlayer proxyGp = (IGamePlayer) Proxy.newProxyInstance(classLoader,cls,invocationHandler);

        proxyGp.login("xiaoming","123456");
        proxyGp.killBoss();
        proxyGp.upGrade();
    }
}
