package Assignments;

public class ConditionalStat {

    public static void main(String[] args) {
        int number = 5;

        
        if (number > 0) {
            System.out.println("Number is positive.");
        } else {
            System.out.println("Number is not positive.");
        }

         
        if (number > 0) {
            System.out.println("Number is positive.");
        } else if (number < 0) {
            System.out.println("Number is negative.");
        } else {
            System.out.println("Number is zero.");
        }

        // switch statement
        switch (number) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Other");
        }

        // Ternary operator
        String result = (number > 0) ? "Positive" : "Not positive";
        System.out.println("Ternary Result: " + result);
    }
}
