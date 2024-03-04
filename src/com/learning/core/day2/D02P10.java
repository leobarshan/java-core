package com.learning.core.day2;

import java.util.Scanner;

public class D02P10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		int res=0;
		while(n>0)
		{
			int b=n%10; //to take the last digit
			res=res*10+b;
			n=n/10; // to remove the last digit
		}
		System.out.println("Reversed num is: " +res);
		sc.close();
	}

}
