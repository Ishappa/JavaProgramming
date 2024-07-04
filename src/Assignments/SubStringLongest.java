
package Assignments;

import java.util.Scanner;

public class SubStringLongest {
    public static void main(String args[]) {
        Scanner ip = new Scanner(System.in);

        String s = ip.next();
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String temp = s.substring(i,j);

                if (isUnique(temp)) {
                    if (temp.length() > result.length()) {//used to check longest unique string
                        result = temp;
                    }
                }
            }
        }
        System.out.println(result);
    }
    public static boolean isUnique(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}
