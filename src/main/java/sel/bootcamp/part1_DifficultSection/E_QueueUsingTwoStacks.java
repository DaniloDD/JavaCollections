package sel.bootcamp.part1_DifficultSection;

import java.util.Stack;

public class E_QueueUsingTwoStacks {
	
	private Stack<Integer> input = new Stack<Integer>();
	private Stack<Integer> output = new Stack<Integer>();
	
	public void enqueue(int x) {
		input.push(x);
	}
	
	public int dequeue() {
		peek();
		return output.pop();
	}
	
	public int peek() {
		if (output.empty()) {
			while (!input.empty()) {
				output.push(input.pop());
			}
		}
		return output.peek();
	}
	
	public boolean isEmpty() {
		return input.empty() && output.empty();
	}
	
	
	public static void main(String [] args) {
		E_QueueUsingTwoStacks queueTwoStack = new E_QueueUsingTwoStacks();
		queueTwoStack.enqueue(10);
		queueTwoStack.enqueue(20);
		queueTwoStack.enqueue(30);
		queueTwoStack.enqueue(40);
		queueTwoStack.enqueue(50);
		
		System.out.println(queueTwoStack.peek());
		queueTwoStack.dequeue();
		System.out.println(queueTwoStack.peek());
		queueTwoStack.dequeue();
		System.out.println(queueTwoStack.peek());
		queueTwoStack.dequeue();
		System.out.println(queueTwoStack.peek());
	}
}