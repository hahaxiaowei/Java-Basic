package cn.edu.hfut.abstractfactory.factory;

import cn.edu.hfut.abstractfactory.product.Computer;
import cn.edu.hfut.abstractfactory.product.Mouse;
import cn.edu.hfut.abstractfactory.product.lenovoimpl.LenovoComputer;
import cn.edu.hfut.abstractfactory.product.lenovoimpl.LenovoMouse;

/**
 * Created by SunWei
 * Date: 2018-08-04
 */
public class ChinaFactory implements ComputerFactory {

    public Computer getComputer() {
        return new LenovoComputer();
    }

    public Mouse getMouse() {
        return new LenovoMouse();
    }
}
