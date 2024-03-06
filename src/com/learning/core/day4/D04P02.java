package com.learning.core.day4;
import java.util.Scanner;

public class D04P02 {
	public static void main(String[] args) {
		
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Enter player name:");
	        String playerName = sc.nextLine();
	        
	        System.out.println("Enter ratings of critic 1:");
	        float critic1 = sc.nextFloat();
	        
	        System.out.println("Enter ratings of critic 2:");
	        float critic2 = sc.nextFloat();
	        
	        System.out.println("Does this player have a rating from critic 3? (Y/N)");
	        char choice = sc.next().charAt(0);
	        
	        if (choice == 'Y' || choice == 'y') {
	            System.out.println("Enter ratings of critic 3:");
	            float critic3 = sc.nextFloat();
	            
	            try {
	                CricketRating player = new CricketRating(playerName, critic1, critic2, critic3);
	                player.display();
	            } catch (NotEligibleException e) {
	                System.out.println("NotEligible: " + e.getMessage());
	            }
	        } else {
	            try {
	                CricketRating player = new CricketRating(playerName, critic1, critic2);
	                player.display();
	            } catch (NotEligibleException e) {
	                System.out.println("NotEligible: " + e.getMessage());
	            }
	        }
	        
	        sc.close();
	    }
	}
