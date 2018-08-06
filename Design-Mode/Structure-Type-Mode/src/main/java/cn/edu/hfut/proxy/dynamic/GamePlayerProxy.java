package cn.edu.hfut.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by SunWei
 * Date: 2018-08-06
 * time: 22:56
 */
public class GamePlayerProxy {

    IGamePlayer player = new GamePlayer("李四");

    public IGamePlayer invoke(){

        final IGamePlayer iGamePlayer =(IGamePlayer) Proxy.newProxyInstance(GamePlayerProxy.class.getClassLoader(), GamePlayer.class.getInterfaces(), new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object result = null;
                if (method.getName().equalsIgnoreCase("login")){
                    result = method.invoke(player,args);
                    return result;
                }
                result = method.invoke(player, args);
                return result;
            }
        });
        return iGamePlayer;
    }
}
