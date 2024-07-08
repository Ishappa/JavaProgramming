package BasicLogical;

public class sumofduplicate {

	public static void main(String[] args) {
//		 int [] arr1= {1,2,1,2,3};
//		 int [] arr2= {1,2,1,2,3};
//		 int sum=0;
//		 for(int i=0;i<arr1.length;i++)
//		 {
//			 int c=0;
//			 for(int j=1;j<arr2.length;j++)
//			 {
//				if(arr1[i]==arr2[j])
//				{
//					c++;
//					arr2[j]=-1;
//				}
//				 
//				
//			 }
//			 if(arr1[i]!=-1&&c>0)
//			 {
//				 sum=sum+arr1[i];
//			 }
//			 
//			
//		 }
//		 System.out.println(sum);
		
		int [] n= {1,2,3,4,5,5,1};
		int sum=0;
		
		for(int i=0;i<n.length;i++) {
			for(int j=i+1;j<n.length;j++) {
				if(n[i]==n[j]) {
					 sum=sum+n[j];
					
				}
				
			}
			
		}
		System.out.println(sum);
	}

}
