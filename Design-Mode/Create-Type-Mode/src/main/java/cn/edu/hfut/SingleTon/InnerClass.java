package cn.edu.hfut.SingleTon;

/**
 * Created by SunWei
 * Date: 2018-08-05
 * time: 10:56
 */
public class InnerClass {

    static class Holder{
        private static InnerClass innerClass = new InnerClass();
    }

    public static final InnerClass getInstance(){
        return Holder.innerClass;
    }
}
