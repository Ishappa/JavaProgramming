package java8.LambdaExpr;

@FunctionalInterface
interface Demo2{
    int add(int a, int b);
    default int sum(int c, int d){
        return c + d;
    }
    
}

public class Example2 {

}
