package com.learning.core.day7;
import java.util.Stack;
import java.util.Scanner;
public class D07P05 {	
	public static void reverseStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int temp = stack.pop();
            reverseStack(stack);
            insertAtBottom(stack, temp);
        }
    }
    public static void insertAtBottom(Stack<Integer> stack, int item) {
        if (stack.isEmpty()) {
            stack.push(item);
        } else {
            int temp = stack.pop();
            insertAtBottom(stack, item);
            stack.push(temp);
        }
    } 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        System.out.println("Enter the elements you want to reverse ");
        String input = scanner.nextLine();
        String[] elements = input.split(" ");

        for (String element : elements) {
            stack.push(Integer.parseInt(element));
        }
        reverseStack(stack);
        System.out.println(stack);

        scanner.close();
    }
}
