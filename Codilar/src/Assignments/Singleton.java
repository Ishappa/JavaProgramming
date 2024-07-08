package Assignments;

 

	public class Singleton {
	    private static Singleton s;

	    private Singleton() {
	        System.out.println("Object is created");
	    }

	    public static Singleton getInstance() {
	        if (s == null) {
	             s = new Singleton();
	        }
	        return s;
	    }

//	    public void doSomething() {
//	        System.out.println("Singleton instance is doing something.");
//	    }
	    
	    public static void main(String[] args) {
	         
	        Singleton s1 = Singleton.getInstance();

//	        s1.doSomething();

	        Singleton s2 = Singleton.getInstance();

	        // Check if both instances are the same
	        if (s1 == s2) {
	            System.out.println("Both instances are the same.");
	        } else {
	            System.out.println("Both instances are not the same.");
	        }
	    }
	}

	


