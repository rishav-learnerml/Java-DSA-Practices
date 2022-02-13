package Queue;

import java.util.Stack;

public class QueueUsingStacks<T> {
	
	private Stack<T> s1,s2;
	private int size;
	
	public QueueUsingStacks() {
		s1 = new Stack<>();
		s2 = new Stack<>();
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	public void enqueue(T ele) {
//		O(1)
		s1.push(ele);
		size++;
		
		//O(N)
//		while(!s1.empty()) {
//			s2.push(s1.pop());
//		}
//		s1.push(ele);
//		while(!s2.empty()) {
//			s1.push(s2.pop());
//		}
//		size++;
		
		//O(1)
		
	}
	
	public T dequeue() throws QueueEmptyException{
		//O(N)
		if(s1.empty() && s2.empty()) {
			throw new QueueEmptyException();
		}
//		size--;
//		while(!s1.empty()) {
//			s2.push(s1.pop());
//		}
//		T temp = s2.pop();
//		while(!s2.empty()) {
//			s1.push(s2.pop());
//		}
//		return temp;
//		//O(1)
//		size--;
//		return s1.pop();
		
		//O(1) Amortized T.C
		size--;
		if(!s2.empty()) return s2.pop();
		else {
			while(!s1.empty()) s2.push(s1.pop());
		}
		return s2.pop();
		
		
	}
	
	public T front() throws QueueEmptyException {
		//O(n)
		if(s1.empty() && s2.empty()) {
			throw new QueueEmptyException();
		}
//		while(!s1.empty()) {
//			s2.push(s1.pop());
//		}
//		T temp = s2.peek();
//		while(!s2.empty()) {
//			s1.push(s2.pop());
//		}
//		return temp;
		
		//O(1)
//		return s1.peek();
		
		//O(1) Amortized T.C
		if(!s2.empty()) return s2.peek();
		else {
			while(!s1.empty()) s2.push(s1.pop());
		}
		return s2.peek();
	}
}
