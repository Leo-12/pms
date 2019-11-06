package com.youjiuye.common;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapCommon {
	public static String parseparmeterMapToString(Map<String, Object> parameterMap) {

		Set<Map.Entry<String, Object>> entries = parameterMap.entrySet();
		String str = "";
		for (Map.Entry<String, Object> entry : entries) {
			String key = entry.getKey();
			String value = (String)entry.getValue();
			str =str + "&" + "search_" + key + "=" + value;
		}
		return str;
	}

	public static Map<String, String> parseParmeterMaptoMybatisMap(Map<String, Object> parameterMap) {

		Map<String,String> resultMap = new HashMap<String,String>();
		Set<Map.Entry<String, Object>> entries = parameterMap.entrySet();
		for (Map.Entry<String, Object> entry : entries) {
			String key = entry.getKey();
			String value = (String)entry.getValue();
			if (key.contains("like")){
				key = key.substring(key.indexOf("_") + 1);
				value = "%" + value + "%";
			}
			resultMap.put(key,value);
		}
		return resultMap;
	}
}
