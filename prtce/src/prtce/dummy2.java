package prtce;

public class dummy2 {

	public static void main(String[] args) {
		int [] arr= {2,5,8,15,4,6};
		
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println(max);
	}
}
