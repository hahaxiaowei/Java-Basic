package cn.edu.hfut.abstractfactory.product.lenovoimpl;

import cn.edu.hfut.abstractfactory.product.Computer;

/**
 * Created by SunWei
 * Date: 2018-08-04
 */
public class LenovoComputer implements Computer {
    public void calculate() {
        System.out.println("联想电脑计算"+"\r\n");
    }

}
