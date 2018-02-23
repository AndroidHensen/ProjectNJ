package com.handsome.module_engine.U;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * =====作者=====
 * 许英俊
 * =====时间=====
 * 2017/11/25.
 */

public class DateUtils {

    /*
     * 将时间戳转换为时间
     */
    public static String stampToDate(Integer lt) {
        String res;
        SimpleDateFormat simpleDateFormat;
        simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        lt *= 1000;
        Date date = new Date(lt);
        res = simpleDateFormat.format(date);
        return res;
    }

    /*
     * 将固定格式的日期转换为时间戳
     */
    public static long stringToStamp(String dateString) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = df.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        long s = date.getTime();
        return s;
    }

    /**
     * 判断是否为今天
     *
     * @param sdate
     * @return
     */
    private static boolean isToday(Long sdate) {
        boolean b = false;
        Date time = new Date(sdate);
        Date today = new Date();
        if (time != null) {
            String nowDate = dateFormater.get().format(today);
            String timeDate = dateFormater.get().format(time);
            if (nowDate.equals(timeDate)) {
                b = true;
            }
        }
        return b;
    }

    private final static ThreadLocal<SimpleDateFormat> dateFormater = new ThreadLocal<SimpleDateFormat>() {
        @Override
        protected SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd");
        }
    };
}
