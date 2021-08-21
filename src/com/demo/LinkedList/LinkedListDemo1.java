package com.demo.LinkedList;

import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) {
	
		//create a linked list
		LinkedList<String> nameList = new LinkedList<>();
		
		// add the elements to linked list
		
		nameList.add("sachin");
		nameList.add("Sehwag");
		nameList.add("Kohli");
		nameList.add("Drawid");
		nameList.add("sachin");
		nameList.add("Drawid");
		System.out.println(nameList);
		
		nameList.addFirst("Rohith");
		
		System.out.println("list after adding the first element:"+nameList);
		
		nameList.addLast("Rahane");
		System.out.println(nameList.getFirst());
		System.out.println(nameList.getLast());
		
		nameList.offer("chandu");
		System.out.println(nameList);
		
		nameList.offerFirst("Gouse");
		System.out.println(nameList);
		
		nameList.offerLast("Sai");
		System.out.println(nameList);
		
		String peek = nameList.peek();
		System.out.println("peek element::"+peek);
		String peekFirst = nameList.peekFirst();
		System.out.println("peekFirst element::"+peekFirst);
		
		String peekLast =  nameList.peekLast();
		System.out.println("peekLast element::"+peekLast);
		
		//retrive and removal from the list
		String poll = nameList.poll();
		System.out.println("poll:"+poll);
		System.out.println("after poll the list will be::"+nameList);
		
		String pollLast = nameList.pollLast();
		System.out.println("pollLast::"+pollLast);
		System.out.println("after pollLast the list will be::"+nameList);
		
		nameList.removeFirstOccurrence("sachin");
		System.out.println("removal of first occurance:::"+nameList);
		
		nameList.removeLastOccurrence("Drawid");
		System.out.println("removal of last occurance:::"+nameList);
		

	}

}
