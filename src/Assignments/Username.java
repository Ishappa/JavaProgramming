package Assignments;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Username {

    public static boolean isValidUsername(String username){
        String reg="^[a-zA-Z0-9_-]{3,16}$";
        Pattern pattern=Pattern.compile(reg);
        Matcher matcher=pattern.matcher(username);

        return matcher.matches();
    }

    public static void main(String[] args) {

        String username="Ishwark";
        if(isValidUsername(username)){
            System.out.println("Valid username");
        }else {
            System.out.println("Invalid username");
        }


    }
}
