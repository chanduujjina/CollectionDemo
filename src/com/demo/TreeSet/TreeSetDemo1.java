package com.demo.TreeSet;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetDemo1 {

	public static void main(String[] args) {
		
		TreeSet<String> treeset = new TreeSet<>();
		treeset.add("Chandu");
		treeset.add("Divya");
		treeset.add("Tejansh");
		treeset.add("Null");
		treeset.add("Null");
		treeset.add("Surya");
		
		System.out.println(treeset);
		System.out.println(treeset.first());
		System.out.println(treeset.last());
		System.out.println(treeset.pollFirst());
		System.out.println(treeset.pollLast());
		//System.out.println(treeset.lower());
		
		

	
	}
}
