package com.demo.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo1 {

	public static void main(String[] args) {
	
		
		//static way of creation the  array List and adding elements
		
		List<Integer> numberList = Arrays.asList(9,7,5,3,2,1,6,4,2);
		
		System.out.println(numberList);
		
		//dynamic way of creation of  array List
		
		
		//step 1
		//creating array list
		List<Integer> numberList1 = new ArrayList();
		
		
		
		//step 2 adding elements dynamically
		for(int i=1;i<=10;i++) {
			numberList1.add(i);
		}
		
		System.out.println(numberList1);
		
		System.out.println("-----------------------------------------------------");
		
		//fetch the elements from list
		
		for(int number:numberList) {
			System.out.print(" "+number);
		}
		
		System.out.println("------------------");
		//how to get the element from particular index
		
		int valueByIndex= numberList.get(2);
		System.out.println("valueByIndex::"+valueByIndex);
		
		//how to get the index by giving value
		
		int indexbyValue = numberList.indexOf(5);
		System.out.println("indexbyValue::"+indexbyValue);
		
		//how to get last index by the value
		
		int lastIndexbyValue	= numberList.lastIndexOf(2);
		
		System.out.println("lastIndexbyValue::"+lastIndexbyValue);
		
		//how to get size of list
		
		System.out.println("size of the list::"+numberList.size());
		
		//verify whether given list is empty or not
		
		boolean isEmptyFlag = numberList.isEmpty();
		System.out.println(isEmptyFlag);
		
		//verify whether given element is present in the list or not
		
		boolean isContains = numberList.contains(10);
		
		System.out.println(isContains);
		
		//how to clear element from  lists
		
		numberList1.clear();
		
		System.out.println("list after clearing::"+numberList1);
		
		System.out.println("list after removing by value::"+numberList1);
		
	}

}
