package ch10_exception.sec04_Ex;

public class NotExistIDException extends Exception {
	public NotExistIDException() { }
	public NotExistIDException(String message) {
		super(message);
	}
}