package com.lykj.scm.common.request;

import io.swagger.annotations.ApiModelProperty;

/** 
 * @version:v1.0.0
 * @Description:(公共请求)
 * @author:shilei
 * @date:2020年6月20日 下午4:11:58
 */
public class ApiRequest {

	@ApiModelProperty("请求客户端用户")
	private String caller;

	@ApiModelProperty("版本")
	private String version;

	@ApiModelProperty("时间戳")
	private long timestamp;

	@ApiModelProperty("公司编号")
	private String comNo;

	@ApiModelProperty("业务参数")
	protected Param param;

	public String getCaller() {
		return caller;
	}

	public void setCaller(String caller) {
		this.caller = caller;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	public String getComNo() {
		return comNo;
	}

	public void setComNo(String comNo) {
		this.comNo = comNo;
	}

	public Param getParam() {
		return param;
	}

	public void setParam(Param param) {
		this.param = param;
	}
}
