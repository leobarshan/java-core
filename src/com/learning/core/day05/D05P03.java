package com.learning.core.day5;
import java.util.HashSet;
import java.util.Scanner;

class Product {
    private String productId;
    private String productName;

    public Product(String productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    @Override
    public String toString() {
        return productId + " " + productName;
    }
}

public class D05P03 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Product> products = new HashSet<>();
        System.out.println("Enter the number of products:");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter details of the product " + i + ":");
            System.out.print("Product ID: ");
            String productId = sc.nextLine();
            System.out.print("Product Name: ");
            String productName = sc.nextLine();
            Product product = new Product(productId, productName);
            products.add(product);
        }

        sc.close();

        System.out.println("Product details are:");
        for (Product product : products) {
            System.out.println(product);
        }
       
    }
}

