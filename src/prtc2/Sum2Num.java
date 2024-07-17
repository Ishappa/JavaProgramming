package prtc2;

 class Demo1{

    public int sum(int a, int b) {
        return a + b;
    }
}

public class Sum2Num{
    public static void main(String[] args) {

        Demo1 obj = new Demo1();
        int ans = obj.sum(2, 3);
        System.out.println(ans);
        }
}
