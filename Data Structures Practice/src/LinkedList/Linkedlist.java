package LinkedList;


public class Linkedlist<T> {
	//Node class
	public class Node<T>{
		T data;
		Node<T> next;
		
		public Node() {
			
		}
		public Node(T data) {
			this.data = data;
		}
		
	}
	//Head and Tail Pointers
	private Node<T> head;
	private Node<T> tail;
	int size = 0;
	
	//insert
	public void addFirst(T data) {
		size++;
		Node<T> node = new Node<>(data);
		if(getHead()==null) {
			setHead(setTail(node));
			return;
		}
		node.next = getHead();
		setHead(node);
	}
	public void addLast(T data) {
		size++;
		Node<T> node = new Node<>(data);
		if(getHead()==null) {
			setHead(setTail(node));
			return;//will not cause error but it's logical to return from here
		}
		getTail().next = node;
		setTail(node);
	}
	public void add(int index,T data) {
		if(index<0 || index>size) return;
		size++;
		Node<T> node = new Node<>(data);
		if(getHead()==null) {
			setHead(setTail(node));
			return;
		}
		if(index==0) addFirst(data);
		if(index==size) addLast(data);
		Node<T> temp =getHead();
		while(index!=1) {
			temp=temp.next;
			index--;
		}
		node.next=temp.next;
		temp.next=node;
	}
	
	//delete
	public void deleteFirst() {
		if(getHead()==null) {
			return;
		}
		Node<T> temp = getHead();
		setHead(getHead().next);
		temp.next = null;
		size--;
	}
	
	public void deleteLast() {
		if(getHead()==null) {
			return;
		}
		Node<T> temp = getHead();
		while(temp.next!=getTail()) {
			temp=temp.next;
		}
		temp.next = null;
		setTail(temp);
		size--;
	}
	
	public void delete(int index) {
		if(index<0 || index>size) return;
		if(getHead()==null) {
			return;
		}
		if(index==0) deleteFirst();
		if(index==size) deleteLast();
		Node<T> temp =getHead();
		while(index!=1) {
			temp=temp.next;
			index--;
		}
		Node<T> n = temp.next;
		temp.next=temp.next.next;
		n.next=null;
		size--;
	}
	
	//Reverse
	public void reverse() {
		if(getHead()==null || getHead().next==null) {
			return;
		}
		Node<T> temp = getHead();
		Node<T> prev = getHead();
		Node<T> n = getHead().next;
		prev.next = null;
		setTail(prev);
		while(n!=null) {
			temp=n;
			n=n.next;
			temp.next=prev;
			prev=temp;
		}
		setHead(temp);
	}
	
	//Display
	public void display() {
		Node<T> temp = getHead();
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.print("NULL\n");
	}
	
	/**** Recursive Codes ****/
	public void displayRecursive(Node<T> head) {
		//Base Condition
		if(head==null) {
			return;
		}
		//Small step
		System.out.print(head.data+"->");
		//recursive calls
		displayRecursive(head.next);
	
	}
	public void displayRecursive() {
		
		displayRecursive(getHead());
		System.out.print("NULL\n");
	}
	//reverse recursively
	
	public void displayReverseRecursive(Node<T> head) {
		//Base Condition
		if(head==null) {
			return;
		}
		//recursive calls
		displayReverseRecursive(head.next);
		//Small step
		System.out.print(head.data+"->");
	
	}
	public void displayReverseRecursive() {
		
		displayReverseRecursive(getHead());
		System.out.print("NULL\n");
	}
	
	//Take input recursively
	public Node<T> addRecursively(Node<T> head,int pos,T data) {
		//edge case
		if(pos<0 || pos>size) return head;
				
		size++;
		//Base cases
		if(head==null && pos>0) return head; 
		if(pos==0) {
			Node<T> node = new Node(data);
			node.next = head;
			head = node;
			return head;
		}
		
		//recursive case && small step
		head.next = addRecursively(head.next,pos-1,data);
		return head;
	}
	
	public void addRecursively(int pos,T data) {
		setHead(addRecursively(getHead(),pos,data));
	}
	//delete Recursively
	public Node<T> deleteRecursively(Node<T> head,int pos) {
		//edge cases
		if(pos>=size || pos<0) return head;
		
		size--;
		//base cases
		if(head==null && pos>0) {
			return head;
		}
		if(pos==0) {
			Node<T> temp = head;
			head=head.next;
			temp.next=null;
		}
		//recursive case
		head.next = deleteRecursively(head.next,pos-1);
		return head;
	}
	public void deleteRecursively(int pos) {
		setHead(deleteRecursively(getHead(),pos));
	}
	//reverse recursive
	public Node<T> reverseRecursively(Node<T> head){
		//base case
		if(head==null || head.next==null) {
			head=setTail(head);
			return head;
		}
		//recursive call
		Node<T> newHead = reverseRecursively(head.next);
//		head.next.next=head;
		getTail().next=head;
		setTail(head);
		head.next=null;
		return newHead;
	}
	public void reverseRecursively() {
		setHead(reverseRecursively(getHead()));
	}
	
	//find mid
	public T findMid(Node<T> head) { 
		//edge cases
		if(head==null) return null;
		Node<T> slow=head,fast=head;
		while(fast.next!=null && fast.next.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow.data;
	}
	public T findMid() {
		return findMid(getHead());
	}
	public Node<T> getHead() {
		return head;
	}
	public void setHead(Node<T> head) {
		this.head = head;
	}
	public Node<T> getTail() {
		return tail;
	}
	public Node<T> setTail(Node<T> tail) {
		this.tail = tail;
		return tail;
	}

}
