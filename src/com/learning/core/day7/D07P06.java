package com.learning.core.day7;
import java.util.Scanner;
import java.util.Stack;
public class D07P06 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.println("Enter integers for the stack and click enter:");
        String[] inputTokens = scanner.nextLine().split("\\s+");
        for (String token : inputTokens) {
            try {
                stack.push(Integer.parseInt(token));
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter integers only.");
                return;
            }
            scanner.close();
        }
        int minElement = findMinElement(stack);
        System.out.println("Output:");
        System.out.println(minElement);
  }
		public static int findMinElement(Stack<Integer> stack)
		{
        if (stack.isEmpty()) {
            throw new IllegalArgumentException("Stack is empty");
        }

        int minElement = stack.peek(); 
        for (int element : stack) {
            if (element < minElement) {
                minElement = element;
            }
        }

        return minElement;
    }
}

  
