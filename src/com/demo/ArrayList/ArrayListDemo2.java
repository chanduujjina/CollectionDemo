package com.demo.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo2 {

	public static void main(String[] args) {
	
		
		//static way of creation the  array List and adding elements
		
	List<Integer> numberList = Arrays.asList(9,7,5,3,2,1,6,4,2);
		
		// get max from list
		
	int maxValue =	Collections.max(numberList);//9
	
	System.out.println("maxValue::"+maxValue);
		
		//get min from list
	
	int minValue =	Collections.min(numberList);//1
	
	System.out.println("minValue"+minValue);
	
	//sort the list by ascending order
	
	Collections.sort(numberList);//asecding order
	System.out.println("asending order::"+numberList);
	
	Collections.reverse(numberList);//desending order
	System.out.println("desending order::"+numberList);
	
	
	//replace the old value with new value
	Collections.replaceAll(numberList, 2, 10);
	System.out.println("list after replacing::"+numberList);
	
	//find the frequency of an element from the list	
	int frequencyCount = Collections.frequency(numberList, 1);
	System.out.println(frequencyCount);
	
	
		
	}

}
