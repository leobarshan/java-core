package com.learning.core.day7;
import java.util.Scanner;
import java.util.Stack;

public class D07P07 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.println("Enter integers for the stack and click enter to finish:");
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
        boolean result = isTopElementEven(stack);
        System.out.println("Output: " + result);
 }
	public static boolean isTopElementEven(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return false; 
        }
        int topElement = stack.peek();
        return topElement % 2 == 0;
    }
}