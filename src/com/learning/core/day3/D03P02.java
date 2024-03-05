package com.learning.core.day3;
import java.util.Scanner;
public class D03P02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		int n=arr.length;
		System.out.println("enter the numbers from 1 to 40");
		for(int i=0;i<n;i++) 
		{
			int m=sc.nextInt();
			if(m<1 || m>40)
			{
				System.out.println("Invalid");
				i--;
			}
			else {
				arr[i]=m;
			}
			
		}
		System.out.println("Enter 2 num");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==a || arr[i]==b)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("Its BINGO");
		}
		else {
			System.out.println("it is not found");
		}
		
		sc.close();
	}

}
