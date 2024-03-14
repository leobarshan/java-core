package com.learning.core.day9;
import java.util.Scanner;
public class D09P03 {
	
	public void search(int arr[], int key) {
		boolean flag=true;
		for(int i=0;i<arr.length;i++)
		{
			if(key==arr[i])
			{
				if(flag==true)
				{
					System.out.println("Present");
					break;
				}	
			}
		}	
		if(flag==true) {
			System.out.println("Not Present");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		D09P03 linear = new D09P03();
		
		System.out.println("Enter the size ");
		int n = sc.nextInt();
		System.out.println("Enter the elements ");
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Which element you want to search: ");
		int key = sc.nextInt();
		linear.search(arr, key);
		sc.close();
	}
}

