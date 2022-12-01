package ch10_exception.sec04_Ex;

public class WrongPasswordException extends Exception {
	public WrongPasswordException() { }
	public WrongPasswordException(String message) {
		super(message);
	}
}