package com.lykj.scm.common.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;

public class ValidationUtils {

	private static Logger logger = Logger.getLogger(ValidationUtils.class);
	
	/**
     * ������ʽ����֤�ֻ���
     */
	 public static final String REGEX_MOBILE = "^1\\d{10}$";
	 
	/**
	 * ��֤���ƺ�
	 * @param vehicleNo
	 * @return
	 */
	public static boolean validationVehicleNo(String vehicleNo) {
		Pattern pattern = Pattern.compile("^[�����弽ԥ���ɺ�����³������Ӷ���ʽ����¼���������ش�����ʹ��A-Z]{1}[A-Z]{1}(?:(?![A-Z]{4})[A-Z0-9]){4}[A-Z0-9��ѧ���۰�]{1}$");
		Matcher matcher = pattern.matcher(vehicleNo);
		if (!matcher.matches()) {
			logger.info("���ƺŸ�ʽ����ȷ!");
		return false;
		}else{
			logger.info("���ƺŸ�ʽ��ȷ!");
		return true;
	   }
   }

	/**
     * У���ֻ���
     * @param mobile
     * @return У��ͨ������true�����򷵻�false
     */
    public static boolean isMobile(String mobile) {
        return Pattern.matches(REGEX_MOBILE, mobile);
    }
}
