package com.demo.HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		
	
		Set set = new HashSet<>();
		
		set.add("test1");
		set.add("test2");
		set.add("test3");
		set.add("test4");
		set.add("test4");//adding duplicate elements
		set.add(null);
		set.add(null);
		System.out.println(set);
	}

}
