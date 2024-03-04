package com.learning.core.day2;
import java.util.Scanner;

public class D02P17 {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
	        int n;
	        System.out.print("Enter the value of n: ");
	        n = sc.nextInt();

	        for (int i = 2; i <= n; i++) {
	            boolean isPrime = true;
	            for (int j = 2; j < i; j++) {
	                if (i % j == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }
	            if (isPrime) {
	                System.out.print(i + " ");
	            }
	        }
	        sc.close();
	    }
	}
