package StackAndQueueProblems;

public class Solution {
	public int myAtoi(String s) {
        String sign ="";
        int i = 0;
        while(s.charAt(i)==' '){
            i++;
        }
        if(s.charAt(i)=='+' || s.charAt(i)=='-'){
            sign+=s.charAt(i);
            i++;
        }
        String start = "0",end="9";
        while(!((int)(s.charAt(i))>=(int)(start.charAt(0)) || (int)(s.charAt(i))<=(int)(end.charAt(0)))){
            i++;
        }
//        System.out.println(s.charAt(i));
        String ans = "";
        while(((int)(s.charAt(i))>=(int)(start.charAt(0)) || (int)(s.charAt(i))<=(int)(end.charAt(0)) || s.charAt(i)!='\0')) {
        	ans+=s.charAt(i);
        	i++;
        }
        return Integer.parseInt(ans);
    }
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.myAtoi("42"));
	}
}
