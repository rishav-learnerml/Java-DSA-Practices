package Stack;

public class MyStack {
	//Implement
	private int[] data; //Not giving user the access of stack
	private int topIndex;
	private int userStackSize;
	public MyStack() {
		data = new int[10];
		topIndex=-1;
		userStackSize = 0;
	}
	public MyStack(int size) {
		data = new int[size];
		topIndex=-1;
		userStackSize = size;
	}
	//size O(1)
	public int size() {
		return topIndex+1;	
	}
	//Push O(1)
	public void push(int ele) throws StackFullException {
		//If User Specified Stack size is full, throw exception
		if(topIndex==userStackSize-1 && userStackSize!=0) {
			//No more space
			throw new StackFullException();
		}
		//If Default size stack is full, double capacity
		if(topIndex == data.length-1) {
			//double capacity
			doubleCapacity();
		}
		//push element
		data[++topIndex]=ele;
	}
	private void doubleCapacity() {
		int[] temp = data;
		data = new int[2*temp.length];
		for(int i=0; i<temp.length; i++) {
			data[i] = temp[i];
		}
 	}
	//pop O(1)
	public int pop() throws StackEmptyException {
		if(topIndex==-1) throw new StackEmptyException();
		return data[topIndex--];
	}
	//top O(1)
	public int top() throws StackEmptyException {
		if(topIndex==-1) throw new StackEmptyException();
		return data[topIndex];
	}
	//isempty O(1)
	public boolean isEmpty() {
		return topIndex==-1;
	}
		
		
}
