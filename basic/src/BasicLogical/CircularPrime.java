 package BasicLogical;

public class CircularPrime 

     {
	 static int c=0;
	 static int count(int n) 
	 {
		 
		 while(n!=0) {
			 n=n/10;
			 c++;
		 }
		 return c;
	  }
	 static boolean prime(int n)
	 {
		 int c=0;
		 for(int i=1;i<=n;i++)
		 {
			 if(n%i==0)
			 {
				 c++;
			 }
		 }
		 if(c==2)
		 {
			 return true;
		 }
		 return false;
	 }
		
	 
public static void main(String[] args) {
	int n=131;
	boolean circular=true;
	//System.out.println(n);
	 if(prime(n))
	 {
		// System.out.println(n);
		 int c1=count(n);
		 System.out.println(c1);
		 int div=(int)Math.pow(10,c1-1);
		 System.out.println(div);
		 int n1=n;
		 for(int i=1;i<c1;i++) {
			 int t1=n1/div;
			 System.out.println(t1);
			 int t2=n1%div;
			 System.out.println(t2);
			 n=t2*10+t1;
			 if(!prime(n1)) 
			 {
				 circular=false;
				 break;
			 }
		 }
	 }
	
	 else {
		 circular=false;
	 }
	 if(circular)
	 {
		 System.out.println("Circular Prime");
	 }
	 else {
		 System.out.println("Not a Circular Prime");
	 }
	
  }

}

	
