package ObjectClass;

	class Car {
	    String brand;
	     
	    
	    public void start() {
	        System.out.println("The car is starting.");
	    }
	    
	    public void stop() {
	        System.out.println("The car is stopping.");
	    }
	}

	public class ObjClassExample {
	    public static void main(String[] args) {
	        Car myCar = new Car();
	        
	        //we can initialize the diffrent values by using obj refernec with dot operator
	        myCar.brand = "Audi";
	       	        
	        myCar.start();
	        myCar.stop();
	    }
	}

	
	
	

