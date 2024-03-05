package com.learning.core.day3;


public class D03P03 {

	public static void main(String[] args) {
		 int[] arr= {3, 2, 4, 5, 6, 4, 5, 7, 3, 2, 3, 4, 7, 1, 2, 0, 0, 0};
	        
	        int sum = 0;
	        for(int i = 0; i < arr.length - 3; i++) {
	            sum = sum + arr[i];
	        }
	        arr[15] = sum;
	        
	        double avg = (double) sum / (arr.length - 3);
	        arr[16] = (int) Math.round(avg);
	        
	        int min = arr[0];
	        for(int i = 1; i < arr.length - 3; i++) {
	            if (arr[i] < min) {
	                min = arr[i];
	            }
	        }
	        arr[17] = min;
	        
	        for(int num : arr) {
	            System.out.print(" "+num + " ");
	        }
	    }
}