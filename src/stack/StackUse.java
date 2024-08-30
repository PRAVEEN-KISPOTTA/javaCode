package stack;

public class StackUse {

	public static void main(String[] args) {
		StackArrayUsing stack = new StackArrayUsing();
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		System.out.println("top: " + stack.top());
		stack.pop();
		System.out.println("size: " + stack.size());
		System.out.println("isEmpty: " + stack.isEmpty());
		stack.printStack();
	}

}
