package com.lykj.scm.common.utils;

import java.text.SimpleDateFormat;
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
}
