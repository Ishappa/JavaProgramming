
------------------------OOPs------------------------

--> Object-Oriented Programming (OOP) is a programming paradigm centered around the concept of objects, 
which can contain both data and methods.

1. Modularity:
   Encapsulation: OOP allows you to bundle data (attributes) and methods (functions) that operate on the data into a single unit called an object. 
    This encapsulation helps in organizing code into modular sections, making it easier to manage and maintain.
    
    example: bean class  

2. Reusability:
   Inheritance: OOP enables you to create new classes based on existing ones, allowing code reuse. This reduces redundancy and improves efficiency.
   
    example: vehicle property of function from class to all subclasses like bus, car...   

3. Flexibility and Extensibility:
   Polymorphism: OOP allows objects to be treated as instances of their parent class, enabling the same interface to be used for different underlying forms (data types). This provides flexibility in how you interact with objects.
  
    example: overload and override

4. Improved Problem Solving:
   Abstraction: OOP helps in abstracting complex systems into manageable, understandable objects, focusing on what an object does rather than how it does it.
  means: bankApplication: only getting account username not seeing all transation and all it will hide internally make less complex.
    example: abstact class and methods and implment in diffent class.

5. Easier Troubleshooting:
   Object Interactions: Since OOP organizes code into objects, it’s easier to pinpoint where issues are occurring. Each object is responsible for its own state and behavior, making debugging and testing more straightforward.
   Example: If a specific function in an object fails, you can isolate and fix that particular object without affecting the entire system.


6. Data Security:   Encapsulation and Access Control: OOP provides mechanisms like private and protected access modifiers to restrict access to an object’s data, ensuring that only the intended methods can modify the object’s state.
   Example: In an employee management system, sensitive data like salary can be made private, allowing access only through controlled methods.

7. Real-World Modeling: Natural Mapping: OOP allows you to model real-world entities and relationships in your code, making it intuitive to design systems that reflect real-world structures and interactions.
   Example: A Customer class can represent a real customer in an e-commerce system, with properties like name and address, and methods like placeOrder or makePayment.
8. Ease of Collaboration:
   Team Development: OOP’s modularity makes it easier for multiple developers to work on different parts of a program simultaneously. Each developer can focus on a specific class or module without worrying about the rest of the program.
   Example: In a large software project, one team might work on the UserInterface class while another focuses on the DatabaseConnection class.
---------------------------Threads-------------------
What are Threads?

1. Threads are lightweight subprocesses that allow concurrent execution of tasks within a program.

3 ways we can create Threads.
--------------------------------
1. extends Thread class --> use run() and call start() in main method.
   2. implements Runnable interface 
   --> here also use run() and create thread obj in main method pass runnable interfaces in thread obj and call run() using thread obj ref.
   example:
          class MyRunnable implements Runnable {
          public void run() {
          // Code to execute in the thread
          System.out.println("Thread is running");
          }
          }
    
            public class MainClass {
            public static void main(String[] args) {
            // Creating a new Thread object and passing an instance of MyRunnable to it
            Thread thread = new Thread(new MyRunnable());
    
            // Starting the thread
            thread.start();
        }
       }


3. using lambda exp to runnable obj make code less using one class for all threads. 

example:
        public class MainClass {
        public static void main(String[] args) {
        // Creating and starting a thread using a lambda expression
        Thread thread = new Thread(() -> {
        // Code to execute in the thread
        System.out.println("Thread is running using lambda");
        });
        
                // Starting the thread
                thread.start();
            }
        }

======================LIFE CYCLE OF THREADS=================================
NEW                         -->Thread thread = new Thread(); // Thread is in NEW state
|
v
RUNNABLE <--------+         --> Thread thread = new Thread(() -> {
|                                // Code to execute
|                               });
|                               thread.start(); // Thread is in RUNNABLE state
|
|             |
v             |
BLOCKED          |      
|             |
v             |
WAITING          |          --> Waiting state: The thread will be in waiting state when it calls wait() method or join() method.
|                              
|                              It will move to the runnable state when other thread will notify or that thread will be terminated.
                                example:
                                synchronized (lock) {
                                lock.wait(); // Thread transitions to WAITING state
                                }     
|                               
|
|             |
v             |
TIMED_WAITING    |    Timed Waiting: A thread lies in a timed waiting state when it calls a method with a time-out parameter. A thread lies in this state until the timeout is completed or until a notification is received. For example, when a thread calls sleep or a conditional wait, it is moved to a timed waiting state.
                        example: Thread.sleep(1000); // Thread transitions to TIMED_WAITING state for 1 second

|             |
v             |
TERMINATED <------+

======================Collection API========================
List-->
1. ArrayList
2. LinkedList

Que-->
1. DeQue
2. LinkedList

Set-->
1. HashSet -->Insertion order Will not maintain.
2. LinkedHashSet --> Insertion order Will maintain.
3. TreeSet -->Default Sorting Order Will maintain.
========================JAVA *8=====================

FunctionalInterface
------------------------

*should have only 1 abstarct method
*Any no of default methods
*Any no of static methods

Example:

Lambda Expressions
---------------------

package lambda;

@FunctionalInterface
public interface practc2
{
double calc(double a, double b);

    default int sum(int x, int y) {
        System.out.println("hello codilar");
        return 0;

    }

    default void msg(){
       System.out.println("this is second program");
    }}
===============================================

package lambda;

import java.util.StringJoiner;

public class practc2Main {

    public static void main(String[] args) {
        //1st lambda exp
        System.out.println("1st Lambda exp");
        practc2 p1 = (double x,double z)->{

            System.out.println("The Result is for "+x+" and "+z);
            return x+z;
        };

      double result = p1.calc(10.5,22);
        System.out.println(result);

        //2nd lamda exp
        System.out.println("2nd Lambda exp");
        practc2 p2 = (a,b)->{
            System.out.println("This is second result");
            return a+b;
        };
       double result2 = p2.calc(10,50);
        System.out.println(result2);


        System.out.println("3rd Lambda exp");
        //3rd Lambda exp
        practc2 p3 = (p,q)->p*q;
        System.out.println(p3.calc(20,10));

    }
}




======================Method References:==========
1. Reference to the static method
   className/Interface :: MethodName

ex: EmployeeValidation validEmployee = Employee:: validateEmployee



2. Reference to Non-static method
   -> we have to create obj for the which class had non-static method.

ex: 

        Employee e = new Employee();
        
        EmployeeValidation validEmployee = e:: validateEmployee





Reuse of existing predeifined methods we have.

::  ->double colon will call as a method reference delimeter.

example:
---------

package java8;

@FunctionalInterface
public interface UppercaseConevrt {

    String converterToUpper(String value);
}



package java8;

public class methodReference1 {
public static void main(String[] args) {
UppercaseConevrt conver = (value)->{

            return value.toUpperCase();
        };
        System.out.println(conver.converterToUpper("Hello Codilar"));


	//using method reference here
	//syntax:  className/Interface :: MethodName
        UppercaseConevrt conver1 = String:: toUpperCase;
        System.out.println(conver1.converterToUpper("Hello"));
    }
}

3. Reference to instance Methods of orbitary object of given type:
   ==============================

int compare(T o1,T o2); replacing by using lambda

(o1,o2) -> o1.compareToIgnoreCase(o2)

