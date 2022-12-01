package ch13_generic.sec06;

public class ChildProductStorageMain {

	public static void main(String[] args) {
	// 제네릭 타입의 상속과 구현 예제 
	ChildProduct<Tv, String, String> prd = new ChildProduct<>();
	prd.setKind(new Tv());
	prd.setModel("SmartTv");
	prd.setCompany("삼성");
	
	System.out.println(prd.getModel());
	System.out.println(prd.getCompany());
	
	// 인터페이스 타입에 구현 객체 대입
	
	Storage<Tv> storage = new StorageImple<Tv>(100);
	storage.add(new Tv(), 0);
	Tv tv = storage.get(0);
	
	}

}
