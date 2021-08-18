package com.demo.iterator;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeDemo {

	public static void main(String[] args) {
		

		List<Integer> numberList = new CopyOnWriteArrayList<>();
		
		numberList.add(1);
		numberList.add(2);
		numberList.add(3);
		
		//fetching the element from the collection
		
		for(int i=0;i<numberList.size();i++) {//fetch or read operation
			if(i==2) {
			numberList.remove(i);
			}
			
		}
		System.out.println(numberList);
	}

}
