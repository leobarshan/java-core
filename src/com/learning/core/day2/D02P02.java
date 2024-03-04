package com.learning.core.day2;
import java.util.Scanner;

public class D02P02 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of n:");
		int n=sc.nextInt();
		
		
		System.out.println("numbers less than or equal to "+ n +" are:");
		for(int i=0;i<=n;i++)
		{
			if(i%2==0) 
			{
			System.out.println(i);
			}
		}
		
		sc.close();
	}
	

}
