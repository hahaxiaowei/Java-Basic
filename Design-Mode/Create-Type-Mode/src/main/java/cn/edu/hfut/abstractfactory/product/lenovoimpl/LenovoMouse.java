package cn.edu.hfut.abstractfactory.product.lenovoimpl;

import cn.edu.hfut.abstractfactory.product.Mouse;

/**
 * Created by SunWei
 * Date: 2018-08-04
 */
public class LenovoMouse implements Mouse {
    public void click() {
        System.out.println("联想鼠标");
    }
}
