package stack;

public class StackArrayUsing {
    private int[] data;
    private int topIndex;
    
    public StackArrayUsing() {
        data = new int[10]; // Initial capacity
        topIndex = -1; // Empty stack
    }
    
    public void push(int num) {
        if (topIndex == data.length - 1) {
            // Stack is full, expand array
            expandCapacity();
        }
        data[++topIndex] = num; // Increment index before assignment
    }
    
    public int top() {
        if (topIndex >= 0) {
            return data[topIndex];
        } else {
            throw new IllegalStateException("Stack is empty");
        }
    }
    
    public void pop() {
        if (topIndex >= 0) {
            topIndex--; // Decrement index to remove the top element
        } else {
            throw new IllegalStateException("Stack is empty");
        }
    }
    
    public int size() {
        return topIndex + 1; 
    }
    
    public boolean isEmpty() {
        return topIndex < 0;
    }
    
    private void expandCapacity() {
        int newSize = data.length * 2;
        int[] newArray = new int[newSize];
        System.arraycopy(data, 0, newArray, 0, data.length);
        data = newArray;
    }
    
    public void printStack() {
    	for(int i = 0; i<size(); i++) {
    		System.out.print(data[i] + " ");
    	}
    }
}
