import java.util.Stack;

public class stack {

	public static void main(String[] args) {
		
		Stack <String> stack = new Stack<> ();
		
		stack.push("America");
		stack.push("China");
		stack.push("India");
		
		System.out.println(" Stack is:" +stack);
		
		String removed = stack.pop();
		
		System.out.println("removed: " +removed);
		
		System.out.println(" new  Stack is:" +stack);
		
		
		
		
	}

}
