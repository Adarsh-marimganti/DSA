package datastructures.stacks;

import java.util.EmptyStackException;
import java.util.Stack;

public class SortAStack {
	
	/*
	 * Clean approach
	 */
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		st.push(2);
		st.push(5);
		st.push(7);
		st.push(19);
		st.push(-10);
		st.push(6);
		st.push(9);
		Stack<Integer> sortStack = sortStack(st);
		while(!sortStack.isEmpty()) System.out.print(sortStack.pop()+" ");
		
	}

	private static Stack<Integer> sortStack(Stack<Integer> st) {
		Stack<Integer> helper = new Stack<>();
		int pivot = st.peek();
		helper.push(pivot);
		while(!st.isEmpty()) {
			pivot = st.pop();
			while(!helper.isEmpty() && pivot<helper.peek()) {
				st.push(helper.pop());
			}
			helper.push(pivot);
		}
		return helper;
	}

	/*
	 * brute force Kind
	 */
	public static void main1(String args) {
		Stack<Integer> st = new Stack<>();
		st.push(2);
		st.push(5);
		st.push(7);
		st.push(19);
		st.push(-10);
		st.push(6);
		st.push(9);
		Stack<Integer> helper = new Stack<>();
		helper.push(-1);
		try {
			while (st.peek() != -1) {
				helper.push(st.pop());
			}
			
		}
		catch (EmptyStackException e) {
			st.push(-1);
			while (helper.peek() != -1) {
				st.push(helper.pop());
			}
		}
		
		
		
		
		Stack<Integer> res = new Stack<>();
		res.add(-1);
		
		while (st.peek() != -1) {
			int min = Integer.MAX_VALUE;
			while (st.peek() != -1) {
				if (st.peek() < min) {
					min = st.peek();
				}
				helper.add(st.pop());

			}
			addBackWithoutMin(st, helper, min);
			res.push(min);
		}
		while (res.peek() != -1)
			System.out.print(res.pop()+" ");

	}

	private static void addBackWithoutMin(Stack<Integer> st, Stack<Integer> helper, int min) {
		while (helper.peek() != -1) {
			if (helper.peek() != min)
				st.push(helper.pop());
			else helper.pop();
		}

	}

}
