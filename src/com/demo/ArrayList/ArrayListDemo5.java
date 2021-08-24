package com.demo.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo5 {

	public static void main(String[] args) {
		
		
		
		
		List<String> nameList = new ArrayList<>();
		nameList.add("test1");
		nameList.add("test3");
		nameList.add("test2");
		if(!nameList.contains("test2")){
			nameList.add("test2");	
		}
		
		
		
		
		System.out.println(nameList);

	}

}
