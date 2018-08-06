package cn.edu.hfut.proxy.staticmode;

/**
 * Created by SunWei
 * Date: 2018-08-06
 * time: 22:49
 */
public class ProxyShop implements ICarProvider {

    private AudiFactory audiFactory;

    public ProxyShop(AudiFactory audiFactory) {
        this.audiFactory = audiFactory;
    }

    public void ProviderCar() {
        audiFactory.ProviderCar();
    }
}
