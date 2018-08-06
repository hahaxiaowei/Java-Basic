package cn.edu.hfut.proxy.staticmode;

/**
 * Created by SunWei
 * Date: 2018-08-06
 * time: 22:48
 */
public class AudiFactory implements ICarProvider {
    public void ProviderCar() {
        System.out.printf("奥迪工厂提供车子");
    }
}
