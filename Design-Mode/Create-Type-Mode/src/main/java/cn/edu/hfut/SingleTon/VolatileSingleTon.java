package cn.edu.hfut.SingleTon;

/**
 * Created by SunWei
 * Date: 2018-08-05
 * time: 10:51
 */
public class VolatileSingleTon {
    private VolatileSingleTon() {
    }

    private static volatile VolatileSingleTon volatileSingleTon;

    public static VolatileSingleTon getInstance() {
        if (volatileSingleTon == null) {
            volatileSingleTon = new VolatileSingleTon();
        }
        return volatileSingleTon;
    }
}
