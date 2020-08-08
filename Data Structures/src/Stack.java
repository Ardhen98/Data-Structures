import java.util.ArrayList;
import java.util.EmptyStackException;

public class Stack<T> {
	
	int size; // size of whole stack
	ArrayList<T> stack = new ArrayList<T>();
	
	// Empty constructor
	public Stack() {}
	
	// Constructor with first element
	public Stack(T firstNum) {
		push(firstNum);
	}
	
	// push element on top of the stack
	public void push(T number) {
		stack.add(0, number);
		size++;
	}
	
	public void pop() {
		if(size == 0) {
			//throw new EmptyStackException();
			System.out.println("Stack is empty! Nothing to pop");
		}
		else {
			stack.remove(0);
			size--;
		}
	}
	
	public int size() {
		return stack.size();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack1 = new Stack<Integer>();
		System.out.println("Size is " + stack1.size);
		stack1.pop();
		stack1.push(4);
		stack1.push(8);
		stack1.push(12);
		System.out.println("Size is " + stack1.size + " stack is " + stack1.stack);
		stack1.pop();
		System.out.println("Size is " + stack1.size + " stack is " + stack1.stack);
		Stack<String> stack2 = new Stack<String>("hello there");
		System.out.println("Size is " + stack2.size + " stack2 is " + stack2.stack);
	}

}
