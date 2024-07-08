package Assignments;

public class LoopingStatements {

	    public static void main(String[] args) {
	        // for loop
	        System.out.println("For Loop:");
	        for (int i = 1; i <= 5; i++) {
	            System.out.println("Iteration " + i);
	        }

	        // while loop
	        System.out.println("\nWhile Loop:");
	        int j = 1;
	        while (j <= 5) {
	            System.out.println("Iteration " + j);
	            j++;
	        }

	        // do-while loop
	        System.out.println("\nDo-While Loop:");
	        int k = 1;
	        do {
	            System.out.println("Iteration " + k);
	            k++;
	        } while (k <= 5);
	        
	        //Nested For Loop using prime num	        
	        for(int l=1;l<=10;l++) {
	        	int c=0;
	        	for(int m=1;m<=10;m++) {
	        		if(l%m==0) {
	        			c++;
	        		}
	        	}
	        	if(c==2) {
	        		System.out.println("\n prime no: "+l);
	        	}
	        }

	        // foreach (enhanced for) loop
	        System.out.println("\nForeach (Enhanced for) Loop:");
	        int[] numbers = {1, 2, 3, 4, 5};
	        for (int num : numbers) {
	            System.out.println("Number: " + num);
	        }
	    }
	}


