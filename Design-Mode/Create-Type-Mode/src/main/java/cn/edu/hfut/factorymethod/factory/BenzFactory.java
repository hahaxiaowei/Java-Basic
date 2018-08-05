package cn.edu.hfut.factorymethod.factory;

import cn.edu.hfut.factorymethod.product.Benz;
import cn.edu.hfut.factorymethod.product.Car;

/**
 * Created by SunWei
 * Date: 2018-08-03
 */
public class BenzFactory implements CarFactory {

    public Car produce() {
        return new Benz();
    }
}
