package StringEX;

public class DemoStringBuffer {
    // this is mutable mean we can modify 
    // string buffer is thread safe and string builder is not thread safe
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Hello");
        System.out.println(sb);

        // but string buffer will have Buffer-size
        System.out.println(sb.capacity());


        sb.append(" World");
        System.out.println(sb);

        //exact from 6th position
        sb.insert(6, "Java");
        System.out.println(sb);

        //delete from 6th position to 10th position but not 11 char
        sb.delete(6, 11);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);
        
    }

}
