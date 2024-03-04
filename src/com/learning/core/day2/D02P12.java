package com.learning.core.day2;
import java.util.Scanner;

public class D02P12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int l=0;l<2*(n-i)-1;l++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}
