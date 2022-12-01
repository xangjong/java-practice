package ch07_Inheritance.sec08;

public class AnimalMain {

	public static void main(String[] args) {
		Animal a = new Animal();
		a.show();

		Cat c = new Cat();
		c.show();

		Dog d = new Dog();
		d.show();

		System.out.println("----------");

		// ap는 Animal 타입의 메소드만 사용 가능
		// Cat의 메소드는 사용 불가
		// 오버라이딩 된 Cat 메소드는 사용 가능
		Animal ap = new Cat();
		ap.show();
		ap.getAni();
		// ap.getCat(); 사용 불가
	}

}
