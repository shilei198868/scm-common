package com.lykj.scm.common.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;

public class ValidationUtils {

	private static Logger logger = Logger.getLogger(ValidationUtils.class);
	
	/**
     * 正则表达式：验证手机号
     */
	 public static final String REGEX_MOBILE = "^1\\d{10}$";
	 
	/**
	 * 验证车牌号
	 * @param vehicleNo
	 * @return
	 */
	public static boolean validationVehicleNo(String vehicleNo) {
		Pattern pattern = Pattern.compile("^[京津沪渝冀豫云辽黑湘皖鲁新苏浙赣鄂桂甘晋蒙陕吉闽贵粤青藏川宁琼使领A-Z]{1}[A-Z]{1}(?:(?![A-Z]{4})[A-Z0-9]){4}[A-Z0-9挂学警港澳]{1}$");
		Matcher matcher = pattern.matcher(vehicleNo);
		if (!matcher.matches()) {
			logger.info("车牌号格式不正确!");
		return false;
		}else{
			logger.info("车牌号格式正确!");
		return true;
	   }
   }

	/**
     * 校验手机号
     * @param mobile
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isMobile(String mobile) {
        return Pattern.matches(REGEX_MOBILE, mobile);
    }
}
