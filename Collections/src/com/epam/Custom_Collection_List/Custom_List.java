package com.epam.Custom_Collection_List;

import java.util.*;

public class Custom_List 
{
	public static void main( String[] args )
    {
    	//ArrayList implementation using List
		
        List<String> arraylist=new ArrayList<String>();
        System.out.println("Implementation of ArrayList:");
        
        arraylist.add("Divya Yasa");
        arraylist.add("SaiUsha");
        arraylist.add("Sravani");
        arraylist.add("Shivani");
        arraylist.add("Spandana");
        arraylist.add("Akshita");
        arraylist.add("Sakila");
        arraylist.add("Rashmitha");
        arraylist.add("Likitha");
        arraylist.add("Shirisha");
        System.out.println(arraylist);
        System.out.println(arraylist.size());
        arraylist.add("Rachana");
        System.out.println(arraylist);
        System.out.println(arraylist.size());
        System.out.println(arraylist.get(3));
        arraylist.remove("Navya");
        System.out.println(arraylist);
        System.out.println(arraylist.size());
        for(String s:arraylist)
        	System.out.print(s+" ");
        System.out.println();
        System.out.println(arraylist.contains("Divya"));
        System.out.println(arraylist.contains("Divya Yasa"));
        for(String s:arraylist)
        	System.out.println(s);
        arraylist.remove(3);
        System.out.println(arraylist.remove(4));
        System.out.println(arraylist.remove("Sakila"));
        arraylist.add(5,"Niharika");
        System.out.println(arraylist);
        System.out.println(arraylist.size());
        System.out.println("Printing using Iterator:");
        Iterator<String>i=arraylist.iterator();
        while(i.hasNext())
        {
        	System.out.println(i.next());
        }
        System.out.println(arraylist.size());
        
        //LinkedList implementation using List
        
        System.out.println();
        System.out.println();
        System.out.println("Implementation of LinkedList:");
        List<String>linkedlist=new LinkedList<String>();
        linkedlist.add("Apple");
        linkedlist.add("Banana");
        linkedlist.add("Grapes");
        linkedlist.add("Mango");
        linkedlist.add("Jack Fruit");
        linkedlist.add("Guava");
        linkedlist.add("Kiwi");
        linkedlist.add("Tomato");
        linkedlist.add("Potato");
        linkedlist.add("Brinjal");
        System.out.println(linkedlist);
        System.out.println(linkedlist.size());
        linkedlist.add("Ice Cream");
        System.out.println(linkedlist);
        System.out.println(linkedlist.size());
        System.out.println(linkedlist.get(3));
        linkedlist.remove("Potato");
        System.out.println(linkedlist);
        System.out.println(linkedlist.size());
        for(String s:linkedlist)
        	System.out.print(s+" ");
        System.out.println();
        System.out.println(linkedlist.contains("Grapes"));
        System.out.println(linkedlist.contains("Jack"));
        for(String s:linkedlist)
        	System.out.println(s);
        linkedlist.remove(3);
        System.out.println(linkedlist.remove(4));
        linkedlist.remove(6);
        linkedlist.remove(1);
        System.out.println(linkedlist.remove("Kiwi"));
        linkedlist.add(3,"Chocolates");
        System.out.println(linkedlist);
        System.out.println(linkedlist.size());
        System.out.println("Printing using Iterator:");
        Iterator<String>it=linkedlist.iterator();
        while(it.hasNext())
        {
        	System.out.println(it.next());
        }
        System.out.println(linkedlist.size());
        
      //Implementation of Stack
        
        System.out.println();
        System.out.println();
        System.out.println("Implementation of Stack:");
        Stack<String>stack=new Stack<String>();
        stack.push("First");
        stack.push("Second");
        stack.push("Third");
        stack.push("Fourth");
        stack.push("Fifth");
        stack.push("Sixth");
        stack.push("Seventh");
        stack.push("Eight");
        stack.push("Ninth");
        stack.push("Tenth");
        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack);
        System.out.println(stack.remove("Second"));
        System.out.println(stack.remove("Fourteenth"));
        System.out.println(stack.size());
        System.out.println(stack);
        System.out.println(stack.remove(6));
        System.out.println(stack.size());
        System.out.println(stack);  
    }

}
