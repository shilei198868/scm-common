package com.lykj.scm.common.response;

/** 
 * @version:v1.0.0
 * @Description:(对类进行功能描述)
 * @author:shilei
 * @date:2020年6月20日 下午4:05:00
 */
public class ResponseFactory {

	public static CommonResponse createCommonResponse(int retCode,String retMsg,Object result){
		CommonResponse response = new CommonResponse();
		response.setRetCode(retCode);
		response.setErrMsg(retMsg);
		response.setData(result);
		return response;
	}
}
