package exception.ways;

class InvalidLengthException extends Exception{
	
	private static final long serialVersionUID = 1L;
	private int length;
	private String message;
	
	public InvalidLengthException(int length,String message) {
		this.length = length;
		this.message = message;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
