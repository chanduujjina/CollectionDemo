package com.demo.Map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		//create map object
		HashMap<Character, String> map = new HashMap<>();
		
		//add elements the map
		map.put('k', "kohli");//map entry
		map.put('b', "bumrah");//map entry
		map.put('s', "saami");
		map.put('i', "ishanth");
		map.put('c', "divya");
		map.put('c', "chandu");
		map.put(null, null);
		map.put(null, "test");
		System.out.println(map);
		
		//get the value from map by giving the key
		System.out.println(map.get('c'));
		
		//iterate the  map
		
		for(Map.Entry<Character, String> mapentry: map.entrySet()){
			System.out.println("key::"+mapentry.getKey()+" value::"+mapentry.getValue());
		}
		
		//verify whether the key is present in map or not
		
		System.out.println(map.containsKey('p'));
		
		//verify whether the value is present in map or not
		
		System.out.println(map.containsValue("kohli"));
		
		//separate all the keys into set/list
		
		Set<Entry<Character, String>> entryset = map.entrySet();
		
		List<Character> keyList =  new ArrayList<>();
		List<String> valueList =  new ArrayList<>();
		for(Entry<Character, String> entry : entryset){
			keyList.add(entry.getKey());
			valueList.add(entry.getValue());
		}
		
		System.out.println(keyList);
		System.out.println(valueList);
			
		//get all keys
		
		Set<Character> setKeys = map.keySet();
		System.out.println(setKeys);
		
		// get all the value
	  Collection<String>	setValue =  map.values();
	  
	  System.out.println(setValue);
		

	}

}
