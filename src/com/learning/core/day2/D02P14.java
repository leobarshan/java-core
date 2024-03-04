package com.learning.core.day2;

import java.util.Scanner;

public class D02P14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first num");
		int n=sc.nextInt();
		System.out.println("Enter the second num");
		int m=sc.nextInt();
		long res=1;
		while(m!=0)
		{
			res=res*n;
			--m;
		}
		System.out.println("The final ans is: " +res );
		sc.close();
	}

}
