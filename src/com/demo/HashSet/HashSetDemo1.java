package com.demo.HashSet;

import java.util.HashSet;
import java.util.Set;

import com.demo.entity.Activity;

public class HashSetDemo1 {
	
	public static void main(String[] args) {
		
		//create an object for hashset
		
		Set<Activity> activitySet = new HashSet<>();
		Activity actvity1 = new Activity(1, "pull", "test1");
		Activity actvity2=  new Activity(1, "pull", "test1");
		Activity actvity3 =   new Activity(2, "pack away", "test2");
		
		activitySet.add(actvity1);
		activitySet.add(actvity2);
		activitySet.add(actvity3);
		
		System.out.println("activity1 hashcode::"+actvity1.hashCode());
		System.out.println("activity2 hashcode::"+actvity2.hashCode());
		
		System.out.println(activitySet);
		
		//how to fetch the elements from collection using set
		
		for(Activity activity : activitySet){
			System.out.println(activity);
		}
		
	}

}
