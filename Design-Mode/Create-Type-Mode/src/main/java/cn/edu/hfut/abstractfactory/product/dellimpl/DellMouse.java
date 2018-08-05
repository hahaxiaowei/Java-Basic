package cn.edu.hfut.abstractfactory.product.dellimpl;

import cn.edu.hfut.abstractfactory.product.Mouse;

/**
 * Created by SunWei
 * Date: 2018-08-04
 */
public class DellMouse implements Mouse {
    public void click() {
        System.out.println("戴尔鼠标");
    }
}
