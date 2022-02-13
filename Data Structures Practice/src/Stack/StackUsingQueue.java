package Stack;

import java.util.Queue;
import java.util.LinkedList;

public class StackUsingQueue<T> {
	private Queue<T> q1;
	private Queue<T> q2;
	private int size;
	
	public StackUsingQueue() {
		q1 = new LinkedList<>();
		q2 = new LinkedList<>();
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	public void push(T ele) {
//		q2.add(ele);
//		while(!q1.isEmpty()) {
//			q2.add(q1.poll());
//		}
//		while(!q2.isEmpty()) {
//			q1.add(q2.poll());
//		}
//		size++;
	/*------ Optimal Solution Using a Single Queue ------*/
		
		q1.add(ele);
		//iterate to size-1 and pop those elements from queue and push them backs
		for(int i = 0; i<q1.size()-1; i++) {
			q1.add(q1.poll());
		}
		size++;
		
	}
	
	public T pop() throws StackEmptyException {
		if(q1.isEmpty()) throw new StackEmptyException();
		size--;
		return q1.poll();
	}
	
	public T top() throws StackEmptyException {
		if(q1.isEmpty()) throw new StackEmptyException();
		return q1.peek();
	}
}
