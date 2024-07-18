package sel.bootcamp.part1_DifficultSection;

import java.util.EmptyStackException;

public class D_StackWithLinkedList {
	
	private ListNode top;
	private int length;
	
	// inner private class for the Nodes of the list \
	private class ListNode {
		private int data;
		private ListNode next;
		
		private ListNode(int data) {
			this.data = data;
		}
	}
	
	public D_StackWithLinkedList() {
		top = null;
		length = 0;
	}
	
	public int length() {
		return length;
	}
	
	public boolean isEmpty() {
		return length ==0;
	}
	
	public void push(int data) {
		ListNode temp = new ListNode(data);
		temp.next = top;		// First push(), top is pointing to null, so temp.next will point to null
		top = temp;
		length++;
	}
	
	public int pop() {			// it always remove the first number inserted
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		else {
			int result = top.data;
			top = top.next;
			length--;
			return result;		// it returns which element was removed
		}
	}
	
	public int peek() {			// return the value of the last inserted node in the stack
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		else {
			return top.data;
		}
	}
	
	public static void main (String[] args) {
		D_StackWithLinkedList stack = new D_StackWithLinkedList();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		
		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack.peek());
	}

}
