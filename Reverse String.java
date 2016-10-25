//344. Reverse String
//Write a function that takes a stirng as input and returns the string reversed.
//
//Use a stack to store the reversed string

import java.util.*;
public class Solution {
	public String reverseString(String s) {
		Stack<Character> st = new Stack<Character>();
		for(int i = 0; i < s.length(); i++) {
			st.push(s.charAt(i));
		}
		char[] array = new char[s.length()];

		for(int i = 0; i < s.length(); i++) {
			array[i] = st.pop();
		}
		
		String reverse = new String(array);
		return reverse;
	}
}