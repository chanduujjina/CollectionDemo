package com.demo.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo1 {

	public static void main(String[] args) {
		
		String name = "chandrasekhar";
		
		//convert string into char array
		char charArray []= name.toCharArray();
		
		//iterate the array using enhanced for loop
		
		Map<Character,Integer> map  = new HashMap();
		int count =1;
		for(char ch :charArray){
		 
			if(map.containsKey(ch)){
			
				map.put(ch, map.get(ch)+1);
			}
			else{
				map.put(ch, count);
			}
			
		}
		System.out.println(map);

	}

}
