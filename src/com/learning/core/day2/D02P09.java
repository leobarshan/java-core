package com.learning.core.day2;

import java.util.Scanner;

public class D02P09 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number till which you want to find cubes: ");
	int n=sc.nextInt();
	int res=0;
	for(int i=1;i<=n;i++)
	{
		res=i*i*i;
		System.out.println("The cube of the numbers is: " +res);
	}
	
	sc.close();
}

}
