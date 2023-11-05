import java.util.Stack;

public class stack {

	public static void main(String[] args) {
		
		Stack <String> stack = new Stack<> ();
		
		stack.push("America");
		stack.push("China");
		stack.push("India");
		
		System.out.println(" org Stack is:" +stack);
		
		String removed = stack.pop();
		
		System.out.println(" after removed: " +removed);
		
		System.out.println(" new  Stack is:" +stack);
		
		String removed1 = stack.peek();
		
		System.out.println(" after peek: " +removed1);
		
		System.out.println(" final  Stack is:" +stack);
		
		
		
		
		
		
	}

}
