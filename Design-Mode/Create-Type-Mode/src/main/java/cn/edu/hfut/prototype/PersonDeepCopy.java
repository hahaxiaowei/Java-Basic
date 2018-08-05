package cn.edu.hfut.prototype;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by SunWei
 * Date: 2018-08-05
 * time: 20:06
 */
public class PersonDeepCopy implements Cloneable, Serializable {

    String name;

    String age;

    String address;

    Date date;

    public PersonDeepCopy(String name, String age, String address, Date date) {
        super();
        this.name = name;
        this.age = age;
        this.address = address;
        this.date = date;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object obj = super.clone(); //直接调用Object对象的clone()方法
                //添加如下代码实现深复制
        PersonDeepCopy s = (PersonDeepCopy)obj;
        s.date = (Date) this.date.clone();
        return obj;
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
