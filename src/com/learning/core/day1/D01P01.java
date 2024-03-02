package com.learning.core.day1;

public class D01P01 {

	 
		
			static class Book {
		        private String book_title;
		        private double book_price;

		        // Constructor(parameterized)
		        public Book(String title, double price) {
		            this.book_title = title;
		            this.book_price = price; //using this keyword
		        }

		        //Getter for title
		        public String getbook_Title() {
		            return book_title;
		        }
		        
		        //setter for the title
		        public void setbook_Title(String title) {
		            this.book_title = title;
		        }

		        //Getter for price
		        public double getPrice() {
		            return book_price;
		        }
		        
		        //setter for price
		        public void setPrice(double price) {
		            this.book_price = price;
		        }
		    }

		    // Method to create object named book
		    public static Book createBooks(String title, double price) {
		        return new Book(title, price);
		    }

		    // Method to display the details of book
		    public static void showBooks(Book book) {
		        System.out.println("Book Title: " + book.getbook_Title());
		        System.out.println("Book Price: " + book.getPrice());
		    }

		    	//main class
		    public static void main(String[] args) {
		        
		        String title = "Java Programming";
		        double price = 350.00;

		        Book book = createBooks(title, price);
		        showBooks(book);
		    }

		}
