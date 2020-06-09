package com.lykj.scm.common.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/** 
 * @version:v1.0.0
 * @Description:(时间工具类)
 * @author:shilei
 * @date:2020年6月9日 下午1:35:17
 */
public class DateTimeUtils {

public static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
	
	/**
	 * 获取当前标准格式化日期时间
	 * @param date
	 * @return
	 */
	public static String getDateTime() {
		return getDateTime(new Date());
	}
	
	/**
	 * 标准格式化日期时间
	 * @param date
	 * @return
	 */
	public static String getDateTime(Date date) {
		return (new SimpleDateFormat(DATE_FORMAT)).format(date);
	}
	
	/**
	 * 获得两个日期之间间隔的天数
	 * @param startDate 起始年月日
	 * @param endDate 结束年月日
	 * @return int
	 */
	public static int getDays(Date startDate, Date endDate) {
		int elapsed = 0;
		Calendar cal = Calendar.getInstance();
        cal.setTime(startDate);
        Date d1 = cal.getTime();
        
        cal.setTime(endDate);
        Date d2 = cal.getTime();
        
        long daterange = d2.getTime() - d1.getTime();
        long time = 1000*3600*24; //一天的毫秒数
        elapsed = (int) (daterange/time);
		return elapsed;
   }
	
	/**
	 * 计算两个时间的差(分钟)
	 * @throws 
	 */
	public static int getDatePoor(Date date1, Date date2) {
	    long nd = 1000 * 24 * 60 * 60;
	    long nh = 1000 * 60 * 60;
	    long nm = 1000 * 60;
	    // long ns = 1000;
	    // 获得两个时间的毫秒时间差异
	    long diff = date1.getTime() - date2.getTime();
	    // 计算差多少天
	    // long day = diff / nd;
	    // 计算差多少小时
	    //long hour = diff % nd / nh;
	    // 计算差多少分钟
	    long min = diff % nd % nh / nm;
	    // 计算差多少秒//输出结果
	    // long sec = diff % nd % nh % nm / ns;
	   /* return day + "天" + hour + "小时" + min + "分钟";*/
	    return new Long(min).intValue();
	}
	
	/**
	 * 时间加分钟后的时间
	 * @return
	 */
	public static Date getAfterDate(Date date,int minute) {
		 long time = minute*60*1000;
		 Date afterDate = new Date(date .getTime() + time);
		 return afterDate;
	}
	/**
	 * 时间减分钟后的时间
	 * @return
	 */
	public static Date getBeforeDate(Date date,long minute) {
		 long time = minute*60*1000;
		 Date afterDate = new Date(date .getTime() - time);
		 return afterDate;
	}
}
