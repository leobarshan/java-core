package com.learning.core.day2;
import java.util.Scanner;

public class D02P07 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the percentage obtained:");
		int p=sc.nextInt();
		if(p>=60)
		{
			System.out.println("Grade A");
		}
		else if(p>=45)
		{
			System.out.println("Grade B");
		}
		else if(p>=35)
		{
			System.out.println("Grade C");
		}
		else
		{
			System.out.println("FAIL");
		}
		sc.close();
	}
}
