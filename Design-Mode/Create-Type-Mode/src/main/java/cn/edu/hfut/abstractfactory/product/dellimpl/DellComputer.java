package cn.edu.hfut.abstractfactory.product.dellimpl;

import cn.edu.hfut.abstractfactory.product.Computer;

import java.util.zip.CheckedOutputStream;

/**
 * Created by SunWei
 * Date: 2018-08-04
 */
public class DellComputer implements Computer {
    public void calculate() {
        System.out.println("戴尔电脑计算"+"\r\n");
    }
}
