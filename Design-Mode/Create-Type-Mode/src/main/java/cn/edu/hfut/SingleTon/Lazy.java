package cn.edu.hfut.SingleTon;

/**
 * Created by SunWei
 * Date: 2018-08-05
 * time: 10:16
 */
public class Lazy {

    // 声明一个 static 类型的计数器
    private static int count;

    private Lazy() {
        System.out.printf("Singleton 私有的构造方法被实例化 " + (++count) + " 次。");
    }

    private static Lazy lazy=null;

    public static synchronized Lazy getHungry() {
        if (lazy==null){
            lazy = new Lazy();
        }
        return lazy;
    }
}
