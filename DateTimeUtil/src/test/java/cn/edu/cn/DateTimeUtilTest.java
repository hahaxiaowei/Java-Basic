package cn.edu.cn;

import cn.edu.huft.DateTimeUtil;
import junit.framework.TestCase;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.logging.SimpleFormatter;

/**
 * Created by SunWei
 * Date: 2018-08-11
 * time: 22:30
 */
public class DateTimeUtilTest extends TestCase {

    private static final String format = "yyyy-MM-dd HH:mm:ss";

    public void testGetTimeDelta() throws Exception{

        LocalDateTime localDateTime1 = LocalDateTime.now();

        LocalDateTime localDateTime2 = localDateTime1.plusDays(1l);


    }
}
