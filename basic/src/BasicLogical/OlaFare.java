package BasicLogical;

import java.util.Scanner;

public class OlaFare {

	public static void main(String[] args) 
		{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the km");
        int km=ip.nextInt();
        if(km<=2)
        {
            System.out.println("15 rupees");
        }
        else if (km<=7)
        {
            System.out.println((15+(km-2)*20)+" Rupees");
        }
        else if (km<=12)
        {
            System.out.println((15+(5*20)+(km-7)*25)+" Rupees");
        }
        else 
        {
            System.out.println((15+(5*20)+(5*25)+(km-12)*30)+" Rupees");
        }
    }
}
	
		  
	
 
