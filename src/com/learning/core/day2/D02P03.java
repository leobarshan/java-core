package com.learning.core.day2;
import java.util.Scanner;

public class D02P03 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first num:");
		int n=sc.nextInt();
		System.out.println("Enter the second num:");
		int m=sc.nextInt();
		System.out.println("Enter the mathematical operator you want to use:");
		char operator=sc.next().charAt(0);
		int result=0;
		switch(operator) {
		case '+':
			result=n+m;
			break;
		case '-':
			result=n-m;
			break;
		case '*':
			result=n*m;
			break;
		case '/':
			if(m!=0) {
			result=n/m;
			}
			else
			{
				System.out.println("Cannot divide by 0");
			}
			break;
		default:
			System.out.println("Enter proper operators");
			
		}
		System.out.println("The final answer is:" +result);
		
		
	sc.close();
		
	}
}
