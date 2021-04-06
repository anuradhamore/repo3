package collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		
		HashSet<String> set= new HashSet<String>();
		
		set.add("Abc");
		set.add("def");
		set.add("eghhh");
		set.add("vhbdc");
		set.add("xdcx");
		set.add("xdc");
		
		for(String var:set) {
			
			System.out.println(var);
		}
		
		System.out.println(set);
	}

}
