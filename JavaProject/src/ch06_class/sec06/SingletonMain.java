package ch06_class.sec06;

public class SingletonMain {

	public static void main(String[] args) {
		// singleton 예제 
		
	//생성자를 private으로 막아 놓았기 때문에 외부에서 Invisible 오류 발생	
	// Singleton obj1 = new Singleton();
		
	// static 메소드인 getInstance() 호출해서
	// Singleton 클래스 타입으로 생성된 객체를 받아옴 
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();

		if(obj1 == obj2) { 
		System.out.println("같은 Singleton 객체입니다.");
		} else System.out.println("다른 Singleton 객체입니다.");

		
	}

}
