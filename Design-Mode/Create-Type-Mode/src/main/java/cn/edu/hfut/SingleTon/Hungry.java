package cn.edu.hfut.SingleTon;

/**
 * Created by SunWei
 * Date: 2018-08-05
 * time: 10:14
 */
public class Hungry {

    private Hungry() {

    }

    private static Hungry hungry = new Hungry();

    public static Hungry getHungry() {
        return hungry;
    }
}
