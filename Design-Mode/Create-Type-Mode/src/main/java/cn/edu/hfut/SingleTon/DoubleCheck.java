package cn.edu.hfut.SingleTon;

/**
 * Created by SunWei
 * Date: 2018-08-05
 * time: 10:48
 */
public class DoubleCheck {
    private DoubleCheck() {
    }

    private static DoubleCheck doubleCheck;

    public static DoubleCheck getDoubleCheck(){
        if (doubleCheck==null){
            synchronized (DoubleCheck.class){
                if (doubleCheck==null){
                    doubleCheck = new DoubleCheck();
                }
            }
        }
        return doubleCheck;
    }
}
