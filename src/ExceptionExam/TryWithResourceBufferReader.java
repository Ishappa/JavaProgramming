package ExceptionExam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TryWithResourceBufferReader {
    public static void main(String[] args) throws IOException {
        int num = 0;

//        BufferedReader br = null;
//        try {
//            InputStreamReader in = new InputStreamReader(System.in);
//             br = new BufferedReader(in);
//            num = Integer.parseInt(br.readLine());
//            System.out.println(num);
//        }
//        finally {
//            br.close();
//        }

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));)
        {
           num = Integer.parseInt(br.readLine());
            System.out.println(num);
        }
    }


}