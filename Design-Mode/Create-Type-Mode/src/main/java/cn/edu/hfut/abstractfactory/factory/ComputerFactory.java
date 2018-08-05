package cn.edu.hfut.abstractfactory.factory;

import cn.edu.hfut.abstractfactory.product.Computer;
import cn.edu.hfut.abstractfactory.product.Mouse;

/**
 * Created by SunWei
 * Date: 2018-08-04
 */
public interface ComputerFactory {

    public Computer getComputer();

    public Mouse getMouse();

}
