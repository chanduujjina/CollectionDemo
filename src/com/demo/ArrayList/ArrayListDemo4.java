package com.demo.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo4 {

	public static void main(String[] args) {
		
		List<String> nameList = new ArrayList();
		
		nameList.add("sachin");
		nameList.add("Sehwag");
		nameList.add("Kohli");
		nameList.add("Drawid");
		nameList.add(null);
		nameList.add(null);
		System.out.println(nameList);
		
		// add the element at first place
		nameList.add(0, "Rohith");
		System.out.println(nameList);
		
		// add the element at last
		nameList.add(nameList.size(), "Rahane");
		System.out.println(nameList);
		
		//how to get the first element from list
		
		
		System.out.println(nameList.get(0));
		
		//how to get the last element from list
		
		System.out.println(nameList.get(nameList.size()-1));
	}

}
