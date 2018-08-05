package cn.edu.hfut.SingleTon.thread;

import cn.edu.hfut.SingleTon.Hungry;

/**
 * Created by SunWei
 * Date: 2018-08-05
 * time: 11:14
 */
public class HungryTheadTest implements Runnable {
    public void run() {
        Hungry hungry = Hungry.getHungry();
        System.out.println(hungry.toString()+"\r\n");
    }
}
