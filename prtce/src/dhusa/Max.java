package dhusa;

public class Max {

	static int Max(int []arr) {
		int max=arr[0];
		 for(int i=0;i<arr.length;i++) {
			 if(max<arr[i]) {
				 max=arr[i];
			 }
		 }
		 return max;
	}
	
	
	
	
	public static void main(String[] args) {
	
	 int [] arr= {1,2,5,8,2,32,15};
	 
	 
	 System.out.println(Max(arr));
}

}
