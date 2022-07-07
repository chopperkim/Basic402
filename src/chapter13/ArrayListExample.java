package chapter13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		// 1.
		ArrayList<String> strList = new ArrayList<>();
		// 2. 
		List<String> list = new ArrayList<>();
		// 3.
		List<String> list2 = Arrays.asList("Java", "JDBC", "Servlet/JSP", "Database");
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		
		for (String string : list) {
			System.out.println(string);
		}
		
		System.out.println();
		list.add(2, "Database");
		list.add("myBatis");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + ": " + list.get(i));
		}
		System.out.println();
		// get
		String skill = list.get(1);
		System.out.println(skill);
		
		// remove
		list.remove(0);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + ": " + list.get(i));
		}
		System.out.println();
		
		list.remove("myBatis");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + ": " + list.get(i));
		}
		System.out.println();
		
		list.clear();
		System.out.println(list.size());
	}
}
