package collections;

import java.util.ArrayList;
import java.util.List;

public class GenericArrayList {

	public static void main(String[] args) {

// Generic:- to resolve typecasting issue.. u can use only store one data type only like integer
		//if its integer then u cant add float, string. but it accepts null
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(87);
		list.add(null);
		
		System.out.println(list.get(2));
		

	}

}
