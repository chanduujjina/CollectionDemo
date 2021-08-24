package com.demo.LinkedHashSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		
     Set set = new LinkedHashSet();
		
		set.add("chandu");
		set.add("gouse");
		set.add("sai");
		set.add("divya");
		set.add("chandu");//adding duplicate elements
		set.add(null);
		set.add(null);
		System.out.println(set);
		
	}

}
