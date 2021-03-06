package StackAndQueueProblems;

import java.util.Stack;

public class NextGreaterElement {
	
	public static int[] NGEbrute(int[] arr) {
		int l = arr.length;
		int[] ans = new int[l];
		for(int i=0;i<l;i++) {
			for(int j=i+1;j<l;j++) {
				if(arr[j]>arr[i]) {
					ans[i] = arr[j];
					break;
				}else {
					ans[i]=-1;
				}
			}
		}
		return ans;
	}
	
	public static int[] NGEbetter(int[] arr) {
		int l = arr.length;
		int[] ans = new int[l];
		Stack<Integer> s = new Stack<>();
		for(int i=l-1;i>=0;i--) {
			if(s.empty()) {
				ans[i]=-1;
				s.push(arr[i]);
			}else {
				while(!s.empty() && s.peek()<=arr[i]) {
					s.pop();
				}
				//check if stack is empty
				if(s.empty()) {
					s.push(arr[i]);
					ans[i] = -1;
				}else {
					ans[i]=s.peek();
					s.push(arr[i]);
				}
			}
		}
		return ans;
	}
	
	 public static int[] NGECircular(int[] nums) {
	        int n = nums.length;
	        int[] ans = new int[n];
	        Stack<Integer> s = new Stack<>();
	        for(int i=2*n-1;i>=0;i--){
	            while(!s.empty() && s.peek()<=nums[i%n]){
	                s.pop();
	            }
	            //ans is only of length n, we are only focusing on first half
	            if(i<n){
	                if(s.empty()){
	                    ans[i]=-1;
	                }else{
	                    ans[i]=s.peek();
	                }
	             }
	            
	            s.push(nums[i%n]);
	        }
	        return ans;
	    }

	public static void main(String[] args) {
		int[] arr = {3,10,4,2,1,2,6,1,7,2,9};
		int[] ans = NGECircular(arr);
		for(int item : ans) {
			System.out.print(item+",");
		}
		
	}

}
