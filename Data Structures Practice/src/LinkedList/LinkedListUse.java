package LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListUse {
	public static Linkedlist<Integer> takeInput() {
		Linkedlist<Integer> list = new Linkedlist<>();
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		while(data!=-1) {
			list.addLast(data);
			data=s.nextInt();
		}
		return list;
	}
public static void main(String[] args) {
		/*
		Linkedlist<String> list = new Linkedlist<>();
		list.display();
		list.addFirst("Apple");
		list.display();
		System.out.println(list.size);
		list.addFirst("Mango");
		list.display();
		System.out.println(list.size);
		list.addFirst("Banana");
		list.display();
		System.out.println(list.size);
		list.addLast("Goava");
		list.display();
		System.out.println(list.size);
		list.addLast("Litchi");
		list.display();
		System.out.println(list.size);
		list.addLast("Pineapple");
		list.display();
		System.out.println(list.size);
		list.add(2, "Cherry");
		list.display();
		System.out.println(list.size);
		list.deleteFirst();
		list.display();
		System.out.println(list.size);
		list.deleteLast();
		list.display();
		System.out.println(list.size);
		list.delete(1);
		list.display();
		System.out.println(list.size);
		
		Linkedlist<Integer> list = new Linkedlist<>();
		list= takeInput();
		list.displayRecursive();
//		list.displayReverseRecursive();
//		list.addRecursively(2,20);
//		list.display();
		list.delete(2);
		list.display();
		list.reverseRecursively();
		list.display();
		System.out.println(list.findMid());
		*/
		/*
		 Merge two sorted linked Lists
		 L1: 1->3->5
		 L2: 2->4->6->12->15
		 
		 o/p-> 1->2->3->4->5->6->12->15
		 * */
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(1,100);
		System.out.println(list.get(1));
		System.out.println(list.size());
		
		list.set(0, 60);
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		
	}

}
