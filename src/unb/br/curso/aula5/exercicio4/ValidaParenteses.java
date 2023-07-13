package unb.br.curso.aula5.exercicio4;

import java.util.*;

public class ValidaParenteses {
	public static boolean validateParentheses(String expression) {
		Map<Character, Character> parenthesesMap = new HashMap<>();
		parenthesesMap.put(')', '(');
		parenthesesMap.put(']', '[');
		parenthesesMap.put('}', '{');

		Stack<Character> stack = new Stack<>();

		for (char c : expression.toCharArray()) {
			if (parenthesesMap.containsValue(c)) {

				stack.push(c);
			} else if (parenthesesMap.containsKey(c)) {

				if (stack.isEmpty()) {

					return false;
				}

				char lastOpeningParenthesis = stack.pop();
				if (lastOpeningParenthesis != parenthesesMap.get(c)) {
					return false;
				}
			}
		}

		return stack.isEmpty();
	}

	public static void main(String[] args) {
		String expression1 = "({})[]";
		String expression2 = "({[}])";

		System.out.println("Expression 1 is valid: " + validateParentheses(expression1));
		System.out.println("Expression 2 is valid: " + validateParentheses(expression2));
	}
}

