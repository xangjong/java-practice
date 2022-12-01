package ch07_Inheritance.sec15;

public class AnimalMain {

	public static void main(String[] args) {
		// 추상 클래스 예제
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		System.out.println("------------");

		// 추상 클래스는 new 연산자로 객체 생성 불가
		//	Cannot instantiate the type Animal
		//	Animal animal = new Animal();
		
		Animal animal = null;
		
		animal = new Dog(); // 자동 타입 변환 
		animal.sound(); // 재정의된 메소드 호출 
		
		animal = new Cat();
		animal.sound();
		
		System.out.println("------");
		
		animalSound(new Dog());
		animalSound(new Cat());
		
		// 매개변수 자동 타입 변환 - 매개변수 다형성
		
		}
	public static void animalSound(Animal animal) { 
		animal.sound();
	}

}
