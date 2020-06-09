package com.lykj.scm.common.utils;

import java.util.List;

import org.apache.log4j.Logger;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

/** 
 * @version:v1.0.0
 * @Description:(json工具类)
 * @author:shilei
 * @date:2020年6月9日 下午4:06:33
 */
public class JsonUtils {

	private static Logger logger = Logger.getLogger(JsonUtils.class);

    // 定义jackson对象
    private static final ObjectMapper MAPPER = new ObjectMapper();

    /**
     * 将对象转换成json字符串。
     * <p>Title: pojoToJson</p>
     * <p>Description: </p>
     * @param data
     * @return
     */
    public static String objectToJson(Object data) {
    	try {
			String string = MAPPER.writeValueAsString(data);
			return string;
		} catch (JsonProcessingException e) {
			logger.error(e.getMessage(),e);
		}
    	return null;
    }
    
    /**
     * 将json结果集转化为对象
     * 
     * @param jsonData json数据
     * @param clazz 对象中的object类型
     * @return
     */
    public static <T> T jsonToPojo(String jsonData, Class<T> beanType) {
        try {
            T t = MAPPER.readValue(jsonData, beanType);
            return t;
        } catch (Exception e) {
        	logger.error(e.getMessage(),e);
        }
        return null;
    }
    
    /**
     * 将json数据转换成pojo对象list
     * <p>Title: jsonToList</p>
     * <p>Description: </p>
     * @param jsonData
     * @param beanType
     * @return
     */
    public static <T>List<T> jsonToList(String jsonData, Class<T> beanType) {
    	JavaType javaType = MAPPER.getTypeFactory().constructParametricType(List.class, beanType);
    	try {
    		List<T> list = MAPPER.readValue(jsonData, javaType);
    		return list;
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		}
    	
    	return null;
    }

    public static String formatJson(String objStr){
        String json = objStr.replace("[{", "{\"")
                .replace("}]", "\"}")
                .replace("=", "\":\"")
                .replace(", ", "\",\"");
        return  json;
    }
	
	
}
