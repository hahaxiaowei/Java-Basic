package cn.edu.hfut.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by SunWei
 * Date: 2018-08-07
 */
public class GamePlayerInvocationHandler2 {



    public IGamePlayer getGamePlayer(IGamePlayer iGamePlayer) {

        InvocationHandler invocationHandler = (proxy, method, args) -> {
            Object result = null;
            if (method.getName().equalsIgnoreCase("login")) {
                System.out.println("登陆成功");
                result = method.invoke(iGamePlayer, args);
                return result;
            }
            result = method.invoke(iGamePlayer, args);
            return result;
        };

        IGamePlayer player = (IGamePlayer) Proxy.newProxyInstance(
                IGamePlayer.class.getClassLoader(),
                iGamePlayer.getClass().getInterfaces(),
                invocationHandler);
        return player;
    }
}
