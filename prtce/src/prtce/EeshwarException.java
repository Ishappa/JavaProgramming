package prtce;

public class EeshwarException extends Exception {

	private String message;

	public EeshwarException(String message) {
		super();
		this.message = message;
	}
	@Override
	public String getMessage() {
		return message;
	}

	

	
}
