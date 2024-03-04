package com.learning.core.day2;
import java.util.Scanner;

public class D02P13 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the NUM: ");
		int n=sc.nextInt();
		int ans=1;
		for(int i=1;i<=n;i++)
		{
			ans=ans*i;
		}
		System.out.println(ans);
		
		sc.close();
	}

}
