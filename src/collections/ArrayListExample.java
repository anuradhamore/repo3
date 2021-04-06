package collections;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		/*System.out.println(list);

		System.out.println(list.size()); */
		
		list.add(10);
		list.add("string");
		list.add(10.8);
		list.add("A");
		list.add(19.76);
		list.add("Akash");
		list.add(80);
		
		//System.out.println(list);
		//System.out.println(list.size());
		
		//Fetch the record 
		
		//System.out.println(list.get(2));
		//list.remove(1);
//		for(int i=0;i<list.size();i++) {
//
//			System.out.println(list.get(i));
//	}

		for(Object var:list) {
			
			System.out.println(var);
		}
}
}
