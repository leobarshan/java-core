package com.learning.core.day3;

import java.util.Scanner;

public class D03P13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
        String replacedS = replaceSpaces(input);
        
        System.out.println("Output: " + replacedS);
        sc.close();
    }
    
    public static String replaceSpaces(String str) {
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (ch == ' ') {
                sb.append("%20");
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    
}