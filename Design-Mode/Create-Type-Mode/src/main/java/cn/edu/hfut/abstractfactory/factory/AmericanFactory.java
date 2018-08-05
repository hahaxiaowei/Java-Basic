package cn.edu.hfut.abstractfactory.factory;

import cn.edu.hfut.abstractfactory.product.Computer;
import cn.edu.hfut.abstractfactory.product.Mouse;
import cn.edu.hfut.abstractfactory.product.dellimpl.DellComputer;
import cn.edu.hfut.abstractfactory.product.dellimpl.DellMouse;

/**
 * Created by SunWei
 * Date: 2018-08-04
 */
public class AmericanFactory implements ComputerFactory {

    public Computer getComputer() {
        return new DellComputer();
    }

    public Mouse getMouse() {
        return new DellMouse();
    }
}
