package Collection;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {

                Stack<Integer> s = new Stack<>();

                s.push(1);
                s.push(2);
                s.push(3);

                for(Integer i:s){
                    System.out.println(i);
                }
                System.out.println("-----------------------------");
                int topElement = s.peek();
                System.out.println("Top element: " + topElement);

                int poppedElement = s.pop();
                System.out.println("Popped element: " + poppedElement);

                System.out.println(s);

                // Peek again to see the new top element
                topElement = s.peek();
                System.out.println("Top element after popping: " + topElement);

                // Check if the s is empty
                boolean isEmpty = s.isEmpty();
                System.out.println("Is the s empty?: "+isEmpty);
            }
        }



