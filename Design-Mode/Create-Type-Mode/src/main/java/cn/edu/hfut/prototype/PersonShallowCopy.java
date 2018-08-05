package cn.edu.hfut.prototype;

import java.util.Date;

/**
 * Created by SunWei
 * Date: 2018-08-05
 * time: 20:02
 * 浅复制
 */
public class PersonShallowCopy implements Cloneable {
    String name;

    String age;

    String address;

    Date date;

    public PersonShallowCopy(String name, String age, String address, Date date) {
        super();
        this.name = name;
        this.age = age;
        this.address = address;
        this.date = date;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //直接调用Object对象的clone()方法
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
