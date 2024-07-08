package BasicLogical;

public class continueandbreak {

	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++) {
			if(i == 3) {
				continue;// always continue stmnt should be before print statemnt
			}
			System.out.println(i);
			if(i == 8) {
				break;
			}
			
		}
		
		System.out.println("-------------------while loop-----------------------");
		
		
		int i=1;
		while(i <= 10) {
			if(i == 3) {
				i++;    //In while loop we have to do manually updation or increment and in for automatically happen
				continue;		
			}
			System.out.println(i);
			
			i++;
		}
	}
}
