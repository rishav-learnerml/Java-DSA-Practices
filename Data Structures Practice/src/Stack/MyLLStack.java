package Stack;

import LinkedList.Node;

public class MyLLStack<T> {
	
	private Node<T> head;
	private int size;
	
	
	//size O(1)
	public int size() {
		return size;
	}
	//Push O(1)
	public void push(T ele){
		Node<T> n = new Node<>(ele);
		n.next = head;
		head = n;
		size++;
	}
		
	//pop O(1)
	public T pop() throws StackEmptyException {
		if(head==null) {
			throw new StackEmptyException();
		}
		T temp = head.data;
		head=head.next;
		size--;
		return temp;
	}
	//top O(1)
	public T top() throws StackEmptyException {
		if(head==null) {
			throw new StackEmptyException();
		}
		return head.data;
	}
	//isempty O(1)
	public boolean isEmpty() {
		return size==0;
	}
	
}
