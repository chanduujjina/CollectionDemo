package com.demo.TreeSet;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		  Set set = new TreeSet<>();
			
			set.add("chandu");
			set.add("gouse");
			set.add("sai");
			set.add("divya");
			set.add("chandu");//adding duplicate elements
			
			System.out.println(set);
		
	}

}
