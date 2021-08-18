package com.demo.iterator;

import java.util.Arrays;
import java.util.List;

public class FailFastDemo {

	public static void main(String[] args) {
	
		List<Integer> numberList = Arrays.asList(1,2,4,5,6,8,9,10);
		
		//fetching the element from the collection
		
		for(int i=0;i<numberList.size();i++) {//fetch or read operation
			if(i==2) {
			numberList.remove(i);//delete operation
			}
			
		}

	}

}
