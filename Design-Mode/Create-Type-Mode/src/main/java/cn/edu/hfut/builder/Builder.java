package cn.edu.hfut.builder;

/**
 * Created by SunWei
 * Date: 2018-08-05
 * time: 17:51
 */
public interface Builder {

    public void builderEye();

    public void builderBody();

    public void builderLeg();

    Person buildPerson();
}
