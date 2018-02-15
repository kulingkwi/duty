package org.kulingkwi.duty.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * File: DateUtil.java
 * Desc:
 * Author: gui chulin
 * Datetime: 2018-02-15  08:15
 */
public class DateUtil {

    public static final String DF_YYYYMMDD = "yyyyMMdd";

    public static final Date now() {
        return new Date();
    }

    public static Date getDate(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        return calendar.getTime();
    }

    public static String format(Date date, String format) {
        DateFormat df = new SimpleDateFormat(format);
        return df.format(date);
    }
}
