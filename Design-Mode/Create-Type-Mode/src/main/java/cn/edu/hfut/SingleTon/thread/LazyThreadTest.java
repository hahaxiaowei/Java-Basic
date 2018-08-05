package cn.edu.hfut.SingleTon.thread;

import cn.edu.hfut.SingleTon.Lazy;

/**
 * Created by SunWei
 * Date: 2018-08-05
 * time: 11:19
 */
public class LazyThreadTest implements Runnable {
    public void run() {
        String threadName = Thread.currentThread().getName();
        Lazy lazy = Lazy.getHungry();
        System.out.println("线程 " + threadName + "\t => " + lazy.hashCode());
    }
}
