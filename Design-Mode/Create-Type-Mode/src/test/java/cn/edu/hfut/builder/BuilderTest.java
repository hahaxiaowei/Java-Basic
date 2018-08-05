package cn.edu.hfut.builder;

import junit.framework.TestCase;

/**
 * Created by SunWei
 * Date: 2018-08-05
 * time: 18:07
 */
public class BuilderTest extends TestCase {
    public void testBuilder() {
        Director director = new Director();
        Person person = director.constructPerson(new ConcreatBuiler());
        System.out.printf("eye is :" + person.getEye() + "\r\n" +
                "body is :" + person.getBody()+"\r\n"+"leg is :"+person.getLeg());
    }
}
