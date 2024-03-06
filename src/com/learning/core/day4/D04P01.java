package com.learning.core.day4;
import java.util.Scanner;

public class D04P01 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account number:");
        int accNo = sc.nextInt();
        sc.nextLine(); 
        System.out.println("Enter customer name:");
        String custName = sc.nextLine();
        System.out.println("Enter account type (Saving/Current):");
        String accType = sc.nextLine();
        System.out.println("Enter initial balance:");
        float initialBalance = sc.nextFloat();

        try {
            BankAccount account = new BankAccount(accNo, custName, accType, initialBalance);
            System.out.println("Account created successfully!");
            System.out.println("Current balance: " + account.getBalance());
        } catch (LowBalanceException e) {
            System.out.println(e.getMessage());
        } catch (NegativeAmount e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}