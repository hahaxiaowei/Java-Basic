package cn.edu.hfut.prototype;

import cn.edu.hfut.builder.Person;
import junit.framework.TestCase;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * Created by SunWei
 * Date: 2018-08-05
 * time: 20:27
 */
public class DeepCopyTest extends TestCase {
    public void testDeepCopy()throws Exception{
        Date date = new Date(123123123123L);
        String name = "michel";
        String age = "24";
        String address = "上海";
        PersonDeepCopy deepCopy1 = new PersonDeepCopy(name, age, address, date);
        PersonDeepCopy deepCopy2 = (PersonDeepCopy) deepCopy1.clone();

        System.out.printf(deepCopy1.date+"\r\n");
        System.out.printf(deepCopy2.date+"\r\n");

        deepCopy1.date = new Date(234234234L);

        System.out.printf(deepCopy1.date+"\r\n");
        System.out.printf(deepCopy2.date+"\r\n");
    }

    public void testSerilizableCopy()throws Exception{
        Date date = new Date(123123123123L);
        String name = "michel";
        String age = "24";
        String address = "上海";

        PersonDeepCopy deepCopy1 = new PersonDeepCopy(name,age,address,date);

        //        使用序列化和反序列化实现深复制
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(deepCopy1);
        byte[] bytes = bos.toByteArray();

        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bis);
        PersonDeepCopy deepCopy2 = (PersonDeepCopy)ois.readObject();  //克隆好的对象

        System.out.printf(deepCopy1.date+"\r\n");
        System.out.printf(deepCopy2.date+"\r\n");

        deepCopy1.date = new Date(234234234L);


        System.out.printf(deepCopy1.date+"\r\n");
        System.out.printf(deepCopy2.date+"\r\n");

    }
}
