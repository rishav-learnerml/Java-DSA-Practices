package Stack;

import java.util.Stack;

public class ReverseStack {
	
	public static void reverseStack(Stack<Integer> s,Stack<Integer> helper) {
		//base case --> if stack has 0 or 1 elements
		if(s.size()==0 || s.size()==1) return;
		
		//small step
		int temp = s.pop();
		//recursive case
		reverseStack(s,helper);
		while(!s.empty()) {
			helper.push(s.pop());
		}
		s.push(temp);
		while(!helper.empty()) {
			s.push(helper.pop());
		}
		
	}

	public static void main(String[] args) {
		int[] arr = {5,6,7,1,9};
		Stack<Integer> stack = new Stack<>();
		Stack<Integer> helper = new Stack<>();
		
		for(int elem : arr) {
			stack.push(elem);
		}
		
		reverseStack(stack, helper);
		
		while(!stack.empty()) {
			System.out.println(stack.pop());
		}
	}

}
