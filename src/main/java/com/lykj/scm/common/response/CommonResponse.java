package com.lykj.scm.common.response;


/** 
 * @version:v1.0.0
 * @Description:(对类进行功能描述)
 * @author:shilei
 * @date:2020年6月20日 下午4:05:44
 */
public class CommonResponse  extends ApiResponse {
	public Object getData(){
		return data;
	}
	
	public void setData(Object data){
		this.data = data;
	}

}
