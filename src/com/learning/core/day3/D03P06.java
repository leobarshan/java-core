package com.learning.core.day3;

import java.util.Scanner;

public class D03P06 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String ip=sc.nextLine();
		System.out.println("enter the vowels to count from end");
		int n=sc.nextInt();
		int count=0;
		int vcount=0; //vowels
		StringBuilder lastNVowels=new StringBuilder();
		for(int i=ip.length()-1;i>=0;i--)
		{
			char ch=Character.toLowerCase(ip.charAt(i));
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				count++;
				lastNVowels.insert(0, ch);
				if(count==n)
				{
					break;
				}
				
			}
			
		}
		if(count<n)
		{
			System.out.println("Mismatch");
		}
		else {
			System.out.println("last" + n +"vowels from end: " + lastNVowels );
		}
		
		sc.close();

	}

}
