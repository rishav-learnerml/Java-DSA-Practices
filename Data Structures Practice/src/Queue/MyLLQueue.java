package Queue;

import LinkedList.Node;

public class MyLLQueue<T> {
	private Node<T> front;
	private Node<T> rear;
	private int size;
	
	/* All are O(1) Operation */
	//size
	public int size() {
		return size;
	}
	//is Empty
	public boolean isEmpty() {
		return size==0;
	}
	//enqueue
	public void enqueue(T ele) {
		//mandatory steps
		Node<T> n = new Node<>(ele);
		size++;
		//if the list is empty
		if(rear==null) {
			front = rear = n;
		}
		//if the list is not empty
		rear.next = n;
		rear = n;
	}
	//dequeue
	public T dequeue() throws QueueEmptyException {
		if(front==null) {
			throw new QueueEmptyException();
		}
		size--;
		T temp = front.data;
		front=front.next;
		//if front is null, make rear also point to null
		if(front==null) rear = null;
		return temp;
	}
	//front
	public T front() throws QueueEmptyException {
		if(front==null) {
			throw new QueueEmptyException();
		}
		return front.data;
	}
	
}
