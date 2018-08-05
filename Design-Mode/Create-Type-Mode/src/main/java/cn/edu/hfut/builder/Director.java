package cn.edu.hfut.builder;

/**
 * Created by SunWei
 * Date: 2018-08-05
 * time: 18:01
 */
public class Director {

    public Person constructPerson(Builder builder){
        builder.builderEye();
        builder.builderBody();
        builder.builderLeg();
        return builder.buildPerson();
    }
}
