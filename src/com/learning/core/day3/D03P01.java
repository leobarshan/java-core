package com.learning.core.day3;
import java.util.Scanner;

public class D03P01 {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);

	        System.out.println("Enter a string: ");
	        String s= sc.nextLine();

	        int length = s.length();
	        System.out.println("Length of the given string is: " + length);
	        String u = s.toUpperCase();
	        System.out.println("Uppercase: " + u);

	        
	        if (isPalindrome(s)) {
	            System.out.println("It is a Palindrome");
	        } else {
	            System.out.println("It is not a Palindrome");
	        }
	        sc.close();
	    }

	    
	    private static boolean isPalindrome(String str) {
	        String r = new StringBuilder(str).reverse().toString();
	        return str.equals(r);
	        
	    }
	}
