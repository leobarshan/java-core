package com.learning.core.day2;
import java.util.Scanner;

public class D02P04 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first num: ");
	    int n1 = sc.nextInt();

	    System.out.println("Enter the second num: ");
	    int n2 = sc.nextInt();

	    System.out.println("Enter the third number: ");
	    int n3 = sc.nextInt();
	    
	    int maximum=0;
	    
	    if(n1>n2 && n1>n3)
	    {
	    	maximum=n1;
	    }
	    else if(n2>n1 && n2>n3)
	    {
	    	maximum=n2;
	    }
	    else {
	    	maximum=n3;
	    }
	    System.out.println("The max num out of the three is:" + maximum);
	    
	    sc.close();
		
	}

}
