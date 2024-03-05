package com.learning.core.day3;
import java.util.Scanner;
public class D03P10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        
        int l = findlp(s);
        System.out.println("longest prefix which is sufix too: " + l);
        sc.close();
    }
    
    public static int findlp(String s) {
        int b = s.length();
        for (int length = b - 1; length > 0; length--) {
            if (s.substring(0, length).equals(s.substring(b - length))) {
                return length;
            }
        }
        return 0; 
    }
}
