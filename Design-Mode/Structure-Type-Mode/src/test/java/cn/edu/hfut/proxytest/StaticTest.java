package cn.edu.hfut.proxytest;

import cn.edu.hfut.proxy.staticmode.AudiFactory;
import cn.edu.hfut.proxy.staticmode.ProxyShop;
import junit.framework.TestCase;

/**
 * Created by SunWei
 * Date: 2018-08-06
 * time: 22:52
 */
public class StaticTest extends TestCase {

    public void testStaticProxy(){

        ProxyShop proxyShop = new ProxyShop(new AudiFactory());
        proxyShop.ProviderCar();
    }
}
