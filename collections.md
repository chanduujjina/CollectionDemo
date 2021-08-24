this project for collection practice

1.What is an iterator?

to read or fetch the elements from the collection

1.using legacy for loop
2.using enhanced for loop

1.Fail fast iterator
2.Fail safe iterator

if the user performed multiple opearation on same time on collection it gives concurent modification exception

21/08

ArrayList
1.it follow array data structure
2.Fetching the elements from the collection is fast when compared with Linkedlist
3.It will implement random access interface
4.Manipulation of data(adding,updating,removal) is very slow in ArrayList
5.It won't allow insertion order
LinkedList:
1.It will follow double linkedlist data structure
2.Fetching the elements from the collection is slow when compared with ArrayList
3.It will implemtnt the Quee interface
4.Manipulation of data(adding,updating and removal of elements) is very fast in Linkedlist
5.It will follow the inserion order.

Tomarrow:
internal implementation of LinkedList

Few algos on LL

set:
----------

What is set ?
Set is interface only having abstarct methods


1.Set can allow duplicate elements
2.it won't allow more than one null value


HashSet:
before adding elements to set it will check about hash code and equals methods of object

1.Hashcode
2.Equals
3.toString
4.getClass
5.clone
6.wait 2 methods
7.notify,notify all

what is the contract between hashcode and equals
case 1:
you have ovveride hashcode but don't have equals methods-->failure case

case 2:
if you have ovveride hashcode and equals method with few attributes->failure case

case 3:
if you ovveride hashcode and equls with all attibutes->success case

Diffrences between ArrayList and LinkedList?



Diffrences between ArrayList and HashSet

----------------------------------------


Design patterns:
1.Final class
2.Custom immutable class
3.Static block and static class and static varible

1.Singleton
2.Factory design patterns
3.Strategy design patterns

how many ways are there to create object in java?

1.new keyword
2.reflection
3.clone
4.deserilizaion

how to voilate singleton design pattern? and how to prevent the same?


