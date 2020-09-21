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
	 
	 
	//数字
    public static final String REG_NUMBER = ".*\\d+.*";
    //小写字母
    public static final String REG_UPPERCASE = ".*[A-Z]+.*";
    //大写字母
    public static final String REG_LOWERCASE = ".*[a-z]+.*";
    //特殊符号(~!@#$%^&*()_+|<>,.?/:;'[]{}\)
    public static final String REG_SYMBOL = ".*[~!@#$%^&*()_+|<>,.?/:;'\\[\\]{}\"]+.*";
 
    public static boolean checkPasswordRule(String password,String username){
 
        //密码为空及长度大于8位小于30位判断
        if (password == null || password.length() <8 || password.length()>30) return false;
 
        int i = 0;
 
        if (password.matches(ValidationUtils.REG_NUMBER)) i++;
        if (password.matches(ValidationUtils.REG_LOWERCASE))i++;
        if (password.matches(ValidationUtils.REG_UPPERCASE)) i++;
        if (password.matches(ValidationUtils.REG_SYMBOL)) i++;
 
        boolean contains = password.contains(username);
 
        if (i  < 3 || contains)  return false;
 
        return true;
    }
    
    /**
     * 校验手机号
     * 
     * @param mobile
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isMobile(String mobile) {
        return Pattern.matches(REGEX_MOBILE, mobile);
    }
	 
    /**
     * 验证邮箱
     * @param email
     * @return
     */
    public static boolean checkEmail(String email){
        boolean flag = false;
        try{
                String check = "^([a-z0-9A-Z]+[-|_|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
                Pattern regex = Pattern.compile(check);
                Matcher matcher = regex.matcher(email);
                flag = matcher.matches();
            }catch(Exception e){
                flag = false;
            }
        return flag;
    }
    
    /**
	 * 验证车牌号
	 * @param vehicleNo
	 * @return
	 */
	public static boolean validationVehicleNo(String vehicleNo) {
		Pattern pattern = Pattern.compile("^[京津沪渝冀豫云辽黑湘皖鲁新苏浙赣鄂桂甘晋蒙陕吉闽贵粤青藏川宁琼使领A-Z]{1}[A-Z]{1}(?:(?![A-Z]{4})[A-Z0-9]){4}[A-Z0-9挂学警港澳]{1}$");
		Matcher matcher = pattern.matcher(vehicleNo);
		if (!matcher.matches()) {
			/*System.out.println("车牌号格式不对！");*/
		return false;
		}else{
		    /*System.out.println("车牌号格式正确！");	*/
		return true;
	   }
   }
}
