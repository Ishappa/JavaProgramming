package ExceptionExam;

import java.util.Scanner;

class CustomeException2 extends RuntimeException {
    public CustomeException2(String message){
        super(message);
    }
}
public class CustomeExce2 {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int balance = 2000;
        System.out.println("Enter the withdraw amount :");
        int withdraw  = scanner.nextInt();

        if(withdraw<=2000){
            System.out.println("withdraw successfully...");
            balance=balance-withdraw;
            System.out.println("Total Balance Amount is : "+balance);
        }else {
            try{
                throw new CustomeException2("Insufficient balance..!");
            }catch (CustomeException2 c){
                System.out.println(c.getMessage());
            }

        }
        // scanner.close();

    }
}
