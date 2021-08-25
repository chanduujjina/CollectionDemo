package com.demo.TreeSet;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		 TreeSet<String> treeset= new TreeSet<>();
			
		 treeset.add("chandu");
		 treeset.add("gouse");
		 treeset.add("sai");
		 treeset.add("divya");
		 treeset.add("chandu");//adding duplicate elements
			
		System.out.println(treeset);
			
			System.out.println(" Returns the first (lowest) element: "+treeset.first());
			System.out.println(" Returns the last (greatest) element: "+treeset.last());
			//System.out.println(" Return and remove the first (lowest) element:: "+treeset.pollFirst());
			
			System.out.println("after poll first the set will be::"+treeset);
			
			System.out.println(" Return and remove the last (highest) element:: "+treeset.pollLast());
			
			System.out.println("after poll last the set will be::"+treeset);
			//chandu,divya,gouse
			//lower will give you greatest value which is less than given value
			String lower = treeset.lower("chandu");
			System.out.println(lower);
			
			//System.out.println(treeset.ceiling("chandu"));
			
			//System.out.println(treeset.floor("gouse"));
			
			System.out.println(treeset.higher("divya"));
			
		    
	}

}
