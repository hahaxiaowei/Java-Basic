package cn.edu.hfut.singleton;

import cn.edu.hfut.SingleTon.thread.HungryTheadTest;
import junit.framework.TestCase;

/**
 * Created by SunWei
 * Date: 2018-08-05
 * time: 11:01
 */
public class HungryTest extends TestCase {

    public void testHungry(){
        for (int i = 0; i <20 ; i++) {
            Thread thread = new Thread(new HungryTheadTest());
            thread.start();
        }
    }
}
