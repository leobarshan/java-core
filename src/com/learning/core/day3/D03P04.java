package com.learning.core.day3;

import java.util.Scanner;

public class D03P04 {
		
	
	public static int firstRepeating(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    return i;
                }
            }
        }
        return -1;
    }
 
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the size of the array");
    	int size=sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int n = arr.length;
        int index = firstRepeating(arr, n);
 
        if (index == -1) {
            System.out.println("No repeating element found!");
        }
        else {
           
            System.out.println("First repeating element is " + arr[index]);
        }
        sc.close();
    }
}
		  

		    		
