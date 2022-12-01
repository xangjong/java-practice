package ch13_generic.sec03;

public class GenProductMain {

	public static void main(String[] args) {
//	멀티 타입 파라미터 예제
	Product<Tv, String> prd1 = new Product<Tv, String>();
	
	prd1.setKind(new Tv());
	prd1.setModel("스마트Tv");
	
	Tv tv = prd1.getKind();
	String tvModel = prd1.getModel();
	
	System.out.println(tvModel);
	
	// prd2
	// Car 객체 생성 - 모델 : 디젤
	
	
	
	Product<Car, String> prd2 = new Product<Car, String>();
	
	prd2.setKind(new Car());
	prd2.setModel("디젤");
	
	Car car = prd2.getKind();
	String carModel = prd2.getModel();
	System.out.println(carModel);
	
	}

}
