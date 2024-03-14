package com.learning.core.day8;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
public class D08P04 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<String> queue = new LinkedList<>();
        System.out.println("Enter elements of the queue ");//enter [] if you want output as empty
        String input = sc.nextLine().trim();
        if (input.equals("[]")) {
            System.out.println("Empty");
        } else {
            String[] elements = input.split("\\s+");
            for (String element : elements) {
                queue.offer(element);
            }
            if (queue.isEmpty()) {
                System.out.println("Empty");
            } else {
                System.out.println("Not Empty");
            }
        }
        sc.close();
    }
}

