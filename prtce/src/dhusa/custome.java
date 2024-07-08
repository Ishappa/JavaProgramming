package dhusa;

public class custome extends Exception {

	private String message;
	
	public custome(String message) {
		this.message=message;
	}
	@Override
	public String getMessage() {
		return message;
	}
}
