package cn.edu.hfut.factorymethod;

import cn.edu.hfut.factorymethod.factory.AudiFacoty;
import cn.edu.hfut.factorymethod.factory.BenzFactory;
import cn.edu.hfut.factorymethod.factory.Factory;
import junit.framework.TestCase;

/**
 * Created by SunWei
 * Date: 2018-08-03
 */

public class FactoryMethodTest extends TestCase {

    /**
     * 工厂方法模式：就是有一个抽象产品，一个抽象工厂
     * 1.每个产品继承产品抽象类，或者实现产品接口，从而产生具体的产品
     * 2.每个工厂类继承抽象工厂，或者实现工厂接口，负责产生具体的工厂
     * 3.再由每个具体的工厂类负责生产对应的产品
     */
    public void testFactoryMethod(){
        //创建Benz工厂
        BenzFactory benzFactory = new BenzFactory();
        benzFactory.produce().color();
        System.out.print("\r\n");
        benzFactory.produce().mark();
        System.out.print("\r\n");
        benzFactory.produce().run();
        System.out.print("\r\n");

        //创建Audi工厂
        AudiFacoty audiFacoty = new AudiFacoty();
        audiFacoty.produce().color();
        System.out.print("\r\n");
        audiFacoty.produce().mark();
        System.out.print("\r\n");
        audiFacoty.produce().run();
        System.out.print("\r\n");

    }
}
