 package BasicLogical;

public class LeftPrimeSum {
	static boolean isprime(int n)
	{
		int c=0;
		for(int i=0;i<=n;i++)
		{
			if(n%i==0)
			{
				c++;
			}
			if(c==2)
			{
				return true;
			}
			 
			return false;
		}
		return false;
		
	}

	public static void main(String[] args) {
		 
      int [] arr= {1,2,4,5,6,8,13,6};
      for(int i=arr.length-1;i>=0;i--)
      {
    	  int sum=0;
    	  for(int j=i-1;j>=0;j--)
    	  {
    		boolean ans=  isprime(arr[i]);
    		if(ans==true)
    		{
    			sum=sum+arr[j];
    		}
    	  }
    	  if(sum==0)
    	  {
    		  arr[i]=-1;
    	  }
    	  else
    	  {
    		  arr[i]=sum;
    	  }
      }
      for(int i=0;i<arr.length;i++)
      {
    	  System.out.println(arr[i]+" ");
      }
	}

}
