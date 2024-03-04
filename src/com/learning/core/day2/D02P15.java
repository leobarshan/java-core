package com.learning.core.day2;
import java.util.Scanner;

public class D02P15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n=sc.nextInt();
		int pcount=0;
		int ncount=0;
		int zcount=0;
		System.out.println("enter the elements: ");
		for(int i=0;i<=n;i++)
		{
				int m=sc.nextInt();
				if(m>0)
				{
					pcount++;
				}
				else if(m<0)
				{
					ncount++;
				}
				else {
					zcount++;
				}
				
			
		}
		System.out.println("total no of positive numbers:" +pcount);
		System.out.println("total no of negative numbers:" +ncount);
		System.out.println("total no of zeroes :" +zcount);
		
		sc.close();
		
	}

}
