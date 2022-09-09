package validParentheses20;

import java.util.Stack;

public class Solution {
	public boolean isValid(String s) {
		if (s.length() == 0) {
			return true;
		}

		char[] sToChar = s.toCharArray();
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < s.length(); i++) {
			if (sToChar[i] == '(' || sToChar[i] == '[' || sToChar[i] == '{') {
				stack.push(sToChar[i]);
			} else if (sToChar[i] == ')' && stack.peek() == '(' && !stack.empty()) {
				stack.pop();
			} else if (sToChar[i] == ']' && stack.peek() == '[' && !stack.empty()) {
				stack.pop();
			} else if (sToChar[i] == '}' && stack.peek() == '{' && !stack.empty()) {
				stack.pop();
			} else {
				return false;
			}
		}
		return stack.empty();
	}
}
