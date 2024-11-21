package task4;
import java.util.Stack;
import java.util.Scanner;


	public class task4_5 {
	    // Stack to store integers
	    private Stack<Integer> stack = new Stack<>();

	    // Method to push an element onto the stack
	    public void pushElement(int element) {
	        stack.push(element);
	        System.out.println("Pushed " + element + " onto the stack.");
	    }

	    // Method to pop an element from the stack
	    public void popElement() {
	        if (!stack.isEmpty()) {
	            int poppedElement = stack.pop();
	            System.out.println("Popped " + poppedElement + " from the stack.");
	        } else {
	            System.out.println("Stack is empty. Cannot pop any element.");
	        }
	    }

	    // Method to display the current stack
	    public void displayStack() {
	        if (!stack.isEmpty()) {
	            System.out.println("Current stack: " + stack);
	        } else {
	            System.out.println("Stack is empty.");
	        }
	    }

	    // Main method to test the functionality
	    public static void main(String[] args) {
	        task4_5 integerStack = new task4_5();
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("\nChoose an option:");
	            System.out.println("1. Push Element");
	            System.out.println("2. Pop Element");
	            System.out.println("3. Display Stack");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter an integer to push: ");
	                    int element = scanner.nextInt();
	                    integerStack.pushElement(element);
	                    break;

	                case 2:
	                    integerStack.popElement();
	                    break;

	                case 3:
	                    integerStack.displayStack();
	                    break;

	                case 4:
	                    System.out.println("Exiting the program. Goodbye!");
	                    scanner.close();
	                    return;

	                default:
	                    System.out.println("Invalid choice! Please choose a valid option.");
	            }
	        }
	    }
}