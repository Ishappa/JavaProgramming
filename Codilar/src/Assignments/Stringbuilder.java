package Assignments;

public class Stringbuilder {

	    public static void main(String[] args) {
	        
	        StringBuilder stringBuilder = new StringBuilder();

	        stringBuilder.append("Hello");
	        stringBuilder.append(" ");
	        stringBuilder.append("World!");

	        // Insert a string at a specific position
	        stringBuilder.insert(6, "Java ");

	        // Replace a portion of the string
	        stringBuilder.replace(11, 18, "StringBuilder");

	        // Delete a portion of the string
	        stringBuilder.delete(0, 6);

	        // Convert StringBuilder to a String
	        String result = stringBuilder.toString();

	        // Print the final result
	        System.out.println(result);
	    }
	}

