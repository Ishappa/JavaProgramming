package dhusa;

public class main {

	public static void main(String[] args) {
		String password="ish123";
		if(password=="123") {
			System.out.println("login successful");
		}
		else {
			try {
				throw new custome("invalid password");
			}
			catch(Exception e) {
				String message=e.getMessage();
			}
		}
		
	}
}
