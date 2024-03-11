package com.learning.core.day6;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class D06P02 {
	
	    public static void main(String[] args) {
	    	Scanner sc=new Scanner(System.in);
	        HashMap<String, String> phonebook = new HashMap<>();

	        phonebook.put("Amal", "998787823");
	        phonebook.put("Manvitha", "937843978");
	        phonebook.put("Joseph", "7882221113");
	        phonebook.put("Smith", "8293893311");
	        phonebook.put("Kathe", "7234560011");
	        
	        System.out.println("Enter the name to be searched : ");
	        String searchName = sc.nextLine();
	        String phoneNumber = phonebook.get(searchName);

	        if (phoneNumber != null) {
	            System.out.println(phoneNumber);
	        } else {
	            System.out.println("Not found.");
	        }
	    }
	}


	

	
