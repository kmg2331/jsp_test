package util;

import java.util.HashMap;
import java.util.Map;

public class TestMain {

	public static void main(String[] args) {
		Map<String, String[]> map = new HashMap<String, String[]>();
		map.put("param1", new String[]{"Kim", "Park", "Yi"});
		System.out.println(map);
	}
}