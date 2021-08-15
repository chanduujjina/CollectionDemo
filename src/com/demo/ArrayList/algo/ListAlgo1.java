package com.demo.ArrayList.algo;

import java.util.ArrayList;
import java.util.List;

public class ListAlgo1 {

	public static void main(String[] args) {
	
		String value = "aaabbbbcccddd";
		
		//[a,a,a,a]
		//[b,b,b,b]
		
	//convert string to char array
		
		char charArray[] = value.toCharArray();
		
		//iterate the array
		List<Character> charList = new ArrayList();
		List<List<Character>> finalList = new ArrayList();
		for(char ch :charArray) {
		
			if(charList.contains(ch)) {
				charList.add(ch);
			}
			else {
				charList = new ArrayList();
				charList.add(ch);
				finalList.add(charList);
			}
			
		}
       System.out.println(finalList);
	}

}
