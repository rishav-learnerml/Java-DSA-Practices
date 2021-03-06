package Queue;

public class MyQueue {
	private int[] data;
	private int front; //index of the front element of queue
	private int rear; //index of the rear element of queue
	private int size;
	
	public MyQueue() {
		data = new int[5];
		front = rear = -1;
	}
	public MyQueue(int capacity) {
		data = new int[capacity];
		front = rear = -1;
	}
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
	public void enqueue(int ele) {
		if(size==data.length) {
			//if queue is full, double it's capacity
			doubleCapacity();
		}
		
		//if queue is empty, update front also
		if(size==0) front++;
		
		//queue is not empty
//		rear++;
//		//if there is room but rear is at the end, reset it to beginning [circular queue]
//		if(rear==data.length) {
//			rear = 0;
//		}
		rear = (rear + 1)%data.length;
		data[rear] = ele;
		size++;
		
	}
	//double capacity
	private void doubleCapacity() {
		int[] temp = data;
		data = new int[2*temp.length];
		//maintain fifo sequence while copying
		int index = 0;
		for(int i=front;i<temp.length;i++) {
			data[index++] = temp[i];
		}
		for(int i=0;i<front;i++) {
			data[index++] = temp[i];
		}
		front = 0;
		rear = temp.length-1;
	}
	//dequeue
	public int dequeue() throws QueueEmptyException {
		if(size==0) {
			throw new QueueEmptyException();
		}

		//remove from front and return that value
		int temp = data[front];
//		front++;
//		//There is room but if front is at the end, reset it to beginning [circular queue]
//		if(front==data.length) {
//			front = 0;
//		}
		front = (front + 1)%data.length;
		size--;
		if(size==0) {
			//reset front and rear
			front = rear = -1;
		}
		return temp;
	}
	//front
	public int front() throws QueueEmptyException {
		if(size==0) {
			throw new QueueEmptyException();
		}
		return data[front];
	}
	
}
