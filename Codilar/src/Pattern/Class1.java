package Pattern;

public class Class1 {

	public static void main(String[] args) {

		int n=6;
		for(int i=1;i<=n;i++) {

			for(int j=1;j<=n;j++) {
				if((j==3 && i==1)) {
					System.out.print(" ");
				}

				else if((j==1) || (i==3 && i>=j )||(j==2&&i==1 ) ||(j==3)) {
					System.out.print("*");
				}

				else if((j==2 )) {
					System.out.print(" ");
				}

			}
			System.out.println("");

		}
	}
}
