package com.lykj.scm.common.utils;

/** 
 * @version:v1.0.0
 * @Description:(字符工具类)
 * @author:shilei
 * @date:2020年6月9日 下午1:34:21
 */
public class StringUtils {

	/**
	 * 判空操作
	 * @param value
	 * @return
	 */
	public static boolean isBlank(String value) {
		return value == null || "".equals(value) || "null".equals(value) || "undefined".equals(value);
	}
}
