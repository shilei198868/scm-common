package com.lykj.scm.common.response;

/** 
 * @version:v1.0.0
 * @Description:(公共返回)
 * @author:shilei
 * @date:2020年6月20日 下午3:58:14
 */
public class ApiResponse {

	private int retCode;
	private String errMsg;
	protected Object data;
	
	public int getRetCode() {
		return retCode;
	}
	public void setRetCode(int retCode) {
		this.retCode = retCode;
	}
	public String getErrMsg() {
		return errMsg;
	}
	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
}
