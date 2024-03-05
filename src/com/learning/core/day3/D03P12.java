package com.learning.core.day3;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;


public class D03P12 {

	public static boolean canSplitIntoFourDistinctStrings(String s) {
        if (s.length() < 4) {
            return false;
        }

        for (int i = 1; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                for (int k = j + 1; k < s.length(); k++) {
                    String first = s.substring(0, i);
                    String second = s.substring(i, j);
                    String third = s.substring(j, k);
                    String fourth = s.substring(k);
                    if (!first.equals(second) && !first.equals(third) && !first.equals(fourth) &&
                            !second.equals(third) && !second.equals(fourth) && !third.equals(fourth)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        boolean result = canSplitIntoFourDistinctStrings(input);

        if (result) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }

}