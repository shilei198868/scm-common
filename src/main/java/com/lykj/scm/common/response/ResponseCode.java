package com.lykj.scm.common.response;

/** 
 * @version:v1.0.0
 * @Description:(公共返回代码)
 * @author:shilei
 * @date:2020年6月20日 下午3:59:06
 */
public class ResponseCode {

	public static final int CODE_SUCCESS = 0; //成功
	public static final int CODE_PARAM_INVALID = 10001;
	public static final int CODE_TOKEN_EXPIRED = 10100;  //token过期
	public static final int CODE_SERVICE_EXCEPTION = 10101;
	
	
	public static final String MSG_SUCCESS = "success";
	public static final String MSG_PARAM_INVALID = "参数异常";
	public static final String MSG_TOKEN_EXPIRED = "登录过期，请重新登录";  //token过期
	public static final String MSG_SERVER_EXCEPTION = "接口服务异常";
	
}
