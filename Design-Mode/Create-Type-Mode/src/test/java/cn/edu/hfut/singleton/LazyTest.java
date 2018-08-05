package cn.edu.hfut.singleton;

import cn.edu.hfut.SingleTon.Lazy;
import cn.edu.hfut.SingleTon.SingleTon;
import junit.framework.TestCase;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by SunWei
 * Date: 2018-08-05
 * time: 11:24
 */
public class LazyTest extends TestCase {
    public void testLazy() {
        Runnable LazyTest = () -> {
            String threadName = Thread.currentThread().getName();
            Lazy lazy = Lazy.getHungry();
            System.out.println("线程 " + threadName + "\t => " + lazy.hashCode());
        };
        for (int i = 0; i < 2000; i++) {
            new Thread(LazyTest, "" + i).start();
        }
    }

    public void testLazy2() {
        Runnable LazyTest2 = () -> {
            Set<Lazy> lazySet = new HashSet<>();
            Lazy lazy = Lazy.getHungry();
            lazySet.add(lazy);
            System.out.println("size的大小是" + lazySet.size());
        };
        for (int i = 0; i <1000 ; i++) {
            new Thread(LazyTest2).start();
        }
    }

    public void testEnumSingleTon(){
        Runnable EnumSingleTon = () -> {
            SingleTon singleTon = SingleTon.SINGLE_TON;
            System.out.printf(Thread.currentThread().getName()+ "---"+singleTon.hashCode()+"\r\n");
        };
        for (int i = 0; i <1000 ; i++) {
            new Thread(EnumSingleTon).start();
        }


    }
}
