package Assignments;

public class Exception1 {

	 
	    public static void main(String[] args) {
	   
	        try {
	            int r = 5 / 0;
	        } catch (ArithmeticException e) {
	            System.out.println("ArithmeticException will throw");
	        }

	        
	        try {
	            int[] a = { 1, 2, 3 };
	            int e = a[5];
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("ArrayIndexoutOfBoundsException will throw");
	        }

	        
	        try {
	            String s = null;
	            int length = s.length();
	        } catch (NullPointerException e) {
	            System.out.println("NullpointerException will throw");
	        }

	        
	        try {
	            int age=-5;
	            if (age < 0) {
	                throw new IllegalArgumentException("Age cannot be negative");
	            }
	        } catch (IllegalArgumentException e) {
	            System.out.println("IllegalargumentException will throw");
	        }

	        
	        try {
	            java.io.FileInputStream file = new java.io.FileInputStream("non_existent_file.txt");
	        } catch (java.io.FileNotFoundException e) {
	            System.out.println("FileNotfoundException will throw");
	        }


	    }
	}

	
	
