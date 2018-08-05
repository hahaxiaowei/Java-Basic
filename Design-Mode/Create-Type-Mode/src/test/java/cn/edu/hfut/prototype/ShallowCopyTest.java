package cn.edu.hfut.prototype;

import junit.framework.TestCase;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * Created by SunWei
 * Date: 2018-08-05
 * time: 20:09
 */
public class ShallowCopyTest extends TestCase {

    public void testShallowCopy()throws Exception{
        Date date = new Date(123123123123L);
        String name = "michel";
        String age = "24";
        String address = "上海";

        PersonShallowCopy shallowCopy1 = new PersonShallowCopy(name,age,address,date);
        PersonShallowCopy shallowCopy2 =shallowCopy1.clone();
        System.out.printf(shallowCopy1.date+"\r\n");
        System.out.printf(shallowCopy2.date+"\r\n");



        shallowCopy1.date = new Date(234234234L);
        System.out.printf(shallowCopy1.date+"\r\n");
        System.out.printf(shallowCopy2.date+"\r\n");

    }
}
