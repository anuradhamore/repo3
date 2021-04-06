package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {

		Map<String,Integer> map = new HashMap<String,Integer>();
		
		map.put("FirstName", 10);
		map.put("LastName", 78);
		map.put("Subject", 76);
		map.put("Location", 3434);

		System.out.println(map);
	}

}
