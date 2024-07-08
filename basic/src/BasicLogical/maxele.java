package BasicLogical;

public class maxele {

	public static void main(String[] args) {
		int [] arr= {10,20,21,9,80,63};
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println(max);
	}
}
