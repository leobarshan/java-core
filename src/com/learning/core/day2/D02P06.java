package com.learning.core.day2;
import java.util.Scanner;

public class D02P06 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the day number: ");
		int n=sc.nextInt();
		switch(n){
			case(1):
				System.out.println("Monday");
				break;
			case(2):
				System.out.println("Tuesday");
			    break;
			case(3):
				System.out.println("Wednesday");
				break;
			case(4):
				System.out.println("Thursday");
				break;
			case(5):
				System.out.println("Friday");
				break;
			case(6):
				System.out.println("Saturday");
				break;
			case(7):
				System.out.println("Sunday");
				break;
				default:
					System.out.println("Invalid Input, enter the number from 1-7");
					break;
	}
		sc.close();

}
}