package cn.edu.hfut.factorymethod.product;

import cn.edu.hfut.factorymethod.product.Car;

/**
 * Created by SunWei
 * Date: 2018-08-03
 */
public class Benz implements Car {
    public void run() {
        System.out.print("我是奔驰车，我可以跑");
    }

    public void mark() {
        System.out.print("奔驰车标");
    }

    public void color() {
        System.out.print("奔驰白色");
    }
}
