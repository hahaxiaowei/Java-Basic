package cn.edu.hfut.builder;

/**
 * Created by SunWei
 * Date: 2018-08-05
 * time: 17:52
 */
public class ConcreatBuiler implements Builder {

    Person person;

    public ConcreatBuiler() {
        person = new Person();
    }

    @Override
    public void builderEye() {
        person.setEye("蓝色眼睛");
    }

    @Override
    public void builderBody() {
        person.setBody("建造身体部分");
    }

    @Override
    public void builderLeg() {
        person.setLeg("建造双腿部分");
    }

    @Override
    public Person buildPerson() {
        return person;
    }
}
