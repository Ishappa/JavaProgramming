package Assignments;

public class Stringbuffer {
	
public static void main(String[] args) {

		        // Create a StringBuffer object
		        StringBuffer stringBuffer = new StringBuffer();

		        // Append strings to the StringBuffer
		        stringBuffer.append("Hello");
		        stringBuffer.append(" ");
		        stringBuffer.append("World!");
		             
		        // Insert a string at a specific position
		        stringBuffer.insert(6, "Java ");
		    

		        // Replace a portion of the string
		        stringBuffer.replace(11, 18, "StringBuilder");
		        
		        

		        // Delete a portion of the string
		        stringBuffer.delete(0, 6);
		        System.out.println( stringBuffer);

		        System.out.println("----Convert StringBuffer to a String-----");
		        char []s= {'c','s','a'};
		        String result = stringBuffer.toString();
		        
		        String r = new String(s);
		        System.out.println(r);
		        

		        // Print the final result
		        System.out.println(result);
		    }
}
