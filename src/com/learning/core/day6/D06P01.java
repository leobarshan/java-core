package com.learning.core.day6;

import java.util.HashMap;
import java.util.Map;

public class D06P01 {
	
	    public static void main(String[] args) {
	        
	        Map<String, String> phonebook = new HashMap<>();
	        phonebook.put("Amal", "998787823");
	        phonebook.put("Manvitha", "937843978");
	        phonebook.put("Joseph", "7882221113");
	        phonebook.put("Smith", "8293893311");
	        phonebook.put("Kathe", "7234560011");
	        
	        for (Map.Entry<String, String> entry : phonebook.entrySet()) {
	            System.out.println(entry.getKey() + " " + entry.getValue());
	        }
	    }
	}

	    

