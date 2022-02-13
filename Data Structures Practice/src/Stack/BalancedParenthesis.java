package Stack;
import java.util.Stack;

public class BalancedParenthesis {

	public static void main(String[] args) {
		boolean flag = true;
		Stack<Character> st = new Stack<>();
		String str = "()[({})]";
		int n = str.length();
		for(int i=0;i<n;i++) {
			if(str.charAt(i)=='(' || str.charAt(i)=='{' || str.charAt(i)=='['){
				st.push(str.charAt(i));
			}else {
				if(st.empty()) {
					flag = false;
				}else {
					char bracket = st.peek();
					if((bracket=='(' && str.charAt(i)==')') || (bracket=='{' && str.charAt(i)=='}') || (bracket=='[' && str.charAt(i)==']')){
						st.pop();
					}
				}
				
			}
		}
		if(!st.empty()) flag = false;
		System.out.println(flag);
		
	}

}
