package Assignments;

import java.util.Scanner;
import java.util.regex.*;
public class ValidateUserName {


        public static boolean isValidUsername(String username) {
            String regex = "^[a-zA-Z0-9_-]{5,16}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(username);
            return matcher.matches();
        }

        public static void main(String[] args) {

            Scanner ip = new Scanner(System.in);
            System.out.println("Enter Valid Username");
            String username=ip.next();
            //String username = "my_username123";
            if (isValidUsername(username)) {
                System.out.println("Valid username.");
            } else {
                System.out.println("Invalid username.");
            }
        }
    }


