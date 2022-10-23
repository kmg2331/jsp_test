package util;

import java.lang.reflect.Field;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public class TestUtils {
	public Map<String, Object> toMap(Object obj) {
		Field[] fd = obj.getClass().getDeclaredFields();
		Map<String, Object> result = new HashMap<String, Object>();
		
		for(int i=0;i<fd.length;i++) {
			try {
				result.put(fd[i].getName(), fd[i].get(obj));
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
				return null;
			} catch (IllegalAccessException e) {
				e.printStackTrace();
				return null;
			}
		}
		
		return result;
	}
	
	public Map<String,Object> formatMapRequest(HttpServletRequest request) {
	    HashMap<String, Object> map = new HashMap<String, Object>();
	    
	    Enumeration<String> enumber = request.getParameterNames();
	    
	    while (enumber.hasMoreElements()) {
	        String key = enumber.nextElement().toString();
	        String value = request.getParameter(key);

	        map.put(key, value);  
	    }
	    
	    return map;
	}
}
