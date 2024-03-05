package com.learning.core.day3;

import java.util.Scanner;

public class D03P07 
{
		   
		    static void printSubsequence(String ipstr, String  opstr){
		       
		        if (ipstr.length()==0) {
		            System.out.println( opstr);
		            return;
		        }
		       
		        printSubsequence(ipstr.substring(1),  opstr + ipstr.charAt(0));
		       
		        printSubsequence(ipstr.substring(1),  opstr);
		    }
		    
		    		public static void main(String args[]){
		        
		    			String  opstr = "";
		    			Scanner sc=new Scanner(System.in);
		    			System.out.print("enter a string");
		    			String ipstr = sc.next();
		    			printSubsequence(ipstr, opstr);
		    			sc.close();
		    }
	}
