package Stack;

public class StackUse {

	public static void main(String[] args) throws StackFullException, StackEmptyException {
		StackUsingQueue<Integer> stack = new StackUsingQueue<>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60); //Stack Full Exception
		/*
		 | 40 |
		 ------
		 | 30 |
		 ------
		 | 20 |
		 ------
		 | 10 |
		 ------
		*/
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		/*
		 | 20 |
		 ------
		 | 10 |
		 ------
		*/
		System.out.println(stack.top()); //20
		System.out.println(stack.size()); //2
		System.out.println(stack.isEmpty()); //false
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.isEmpty()); //true
		/*
		 |    |
		 ------
		*/
		System.out.println(stack.size()); //0
		System.out.println(stack.top()); //Stack Empty Exception

	}

}
