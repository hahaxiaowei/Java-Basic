package cn.edu.hfut.factorymethod.factory;

import cn.edu.hfut.factorymethod.product.Audi;
import cn.edu.hfut.factorymethod.product.Car;

/**
 * Created by SunWei
 * Date: 2018-08-03
 */
public class AudiFacoty implements Factory {

    public Car produce() {
        return new Audi();
    }
}
