package ch10_exception.sec04_Ex;

public class LoginMain {

	public static void main(String[] args) {
		try {
			login("white", "12345");
		}catch(Exception e) {
			System.out.println( e.getMessage());
		}
		
		
		try {
			login("blue", "54321");
		}catch(Exception e) {
			System.out.println( e.getMessage());
		}
		
//		try {
//			login("white", "123452");
//		}catch(NotExistIDException e) {
//			System.out.println( e.getMessage());
//		}
//		catch(WrongPasswordException e) {
//			System.out.println( e.getMessage());
//		}
//		
//		try {
//			login("blue", "54321");
//		}catch(NotExistIDException e) {
//			System.out.println( e.getMessage());
//		}catch(WrongPasswordException e) {
//			System.out.println( e.getMessage());
//		}

	}
	
	public static void login(String id, String password) throws NotExistIDException , WrongPasswordException{
		//id가 "blue"가 아니라면 NotExistIDException
		if(!id.equals("blue")) {
			throw new NotExistIDException("아이디가 존재하지 않습니다");
		}
		
		//pw가 "12345"가 아니라면 WrongPasswordException
		if(!password.equals("12345")) {
			throw new WrongPasswordException("패스워드가 틀립니다");
		}
	}

}