package Assignments;

public class OperatoresExample {
 
	    public static void main(String[] args) {
	        // Arithmetic Operators
	        int num1 = 10;
	        int num2 = 5;
	        int sum = num1 + num2;
	        int difference = num1 - num2;
	        int product = num1 * num2;
	        int quotient = num1 / num2;
	        int remainder = num1 % num2;
	        
	        System.out.println("Arithmetic Operators:");
	        System.out.println("Sum: " + sum);
	        System.out.println("Difference: " + difference);
	        System.out.println("Product: " + product);
	        System.out.println("Quotient: " + quotient);
	        System.out.println("Remainder: " + remainder);
	        
	        // Relational Operators
	        boolean isEqual = (num1 == num2);
	        boolean isNotEqual = (num1 != num2);
	        boolean isGreaterThan = (num1 > num2);
	        boolean isLessThan = (num1 < num2);
	        boolean isGreaterOrEqual = (num1 >= num2);
	        boolean isLessOrEqual = (num1 <= num2);
	        
	        System.out.println("\nRelational Operators:");
	        System.out.println("Is Equal: " + isEqual);
	        System.out.println("Is Not Equal: " + isNotEqual);
	        System.out.println("Is Greater Than: " + isGreaterThan);
	        System.out.println("Is Less Than: " + isLessThan);
	        System.out.println("Is Greater Or Equal: " + isGreaterOrEqual);
	        System.out.println("Is Less Or Equal: " + isLessOrEqual);
	        
	        // Logical Operators
	        boolean x = true;
	        boolean y = false;
	        boolean andResult = x && y;
	        boolean orResult = x || y;
	        boolean notResult = !x;
	        
	        System.out.println("\nLogical Operators:");
	        System.out.println("AND Result: " + andResult);
	        System.out.println("OR Result: " + orResult);
	        System.out.println("NOT Result: " + notResult);
	        
	        // Conditional (Ternary) Operator
	        int a = 20;
	        int b = 30;
	        int max = (a > b) ? a : b;
	        
	        System.out.println("\nConditional (Ternary) Operator:");
	        System.out.println("Maximum value: " + max);
	        
	        // Assignment Operators
	        int c = 5;
	        c += 3; // Equivalent to: c = c + 3;
	        System.out.println("\nAssignment Operators:");
	        System.out.println("Updated value of c: " + c);
	        
	        // Bitwise Operators
	        int num3 = 5; // Binary: 0000 0101
	        int num4 = 3; // Binary: 0000 0011
	        int bitwiseAnd = num3 & num4; // Binary AND
	        int bitwiseOr = num3 | num4; // Binary OR
	        int bitwiseXor = num3 ^ num4; // Binary XOR
	        int bitwiseComplement = ~num3; // Binary NOT
	        
	        System.out.println("\nBitwise Operators:");
	        System.out.println("Bitwise AND: " + bitwiseAnd); // Output: 1 (Binary: 0000 0001)
	        System.out.println("Bitwise OR: " + bitwiseOr); // Output: 7 (Binary: 0000 0111)
	        System.out.println("Bitwise XOR: " + bitwiseXor); // Output: 6 (Binary: 0000 0110)
	        System.out.println("Bitwise Complement: " + bitwiseComplement); // Output: -6
	        
	        // Shift Operators
	        int num5 = 16; // Binary: 0001 0000
	        int leftShift = num5 << 2; // Left Shift by 2 bits
	        int rightShift = num5 >> 2; // Right Shift by 2 bits
	        
	        System.out.println("\nShift Operators:");
	        System.out.println("Left Shift: " + leftShift); // Output: 64 (Binary: 0100 0000)
	        System.out.println("Right Shift: " + rightShift); // Output: 4 (Binary: 0000 0100)
	    }
	}


