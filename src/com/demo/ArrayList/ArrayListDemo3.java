package com.demo.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo3 {

	public static void main(String[] args) {
	
		//step 1
		//creating array list
		List<Integer> numberList = new ArrayList();
		
		
		addElementstoList(numberList,300);
		//System.out.println(numberList);
		
		//how to split list into sublist
		int thresshhold=150;
		List<List<Integer>> finalList = splitintoSubList(numberList,thresshhold);
		System.out.println(finalList.size());
		
		
	}

	private static List<List<Integer>> splitintoSubList(List<Integer> numberList, int thresshhold) {
		
		//find sublist count
		List<List<Integer>> finalList = new ArrayList();
		
		int sublistcount =  numberList.size()/thresshhold;//347/100=3
		int remainder = numberList.size()%thresshhold;//remainder =47
		
		int startindex=0;
		int endindex =thresshhold;
		List<Integer> sublist = null;
		for(int i=0;i<sublistcount;i++) {
			
			sublist	 =numberList.subList(startindex, endindex);
			finalList.add(numberList);
			
			startindex=endindex;
			endindex =endindex+thresshhold;
		}
		if(remainder>0) {
		sublist = numberList.subList(startindex, numberList.size());
		finalList.add(numberList);
		
		}
	
		return finalList;
	}

	private static void addElementstoList(List<Integer> numberList,int totalElements) {
		
		for(int i=1;i<=totalElements;i++) {
			numberList.add(i);
		}
	}

}
