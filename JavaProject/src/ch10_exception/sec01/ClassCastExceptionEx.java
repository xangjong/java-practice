package ch10_exception.sec01;

public class ClassCastExceptionEx {

	public static void main(String[] args) {
		Animal animal = new Dog(); // 자동 타입 변환 발생
		changeDog(animal); // ClassCastException 예외 없음

		Cat cat = new Cat();
		changeDog(cat);

	}

	public static void changeDog(Animal animal) {
		// instanceof 연산자 사용해서 타입 확인
		if (animal instanceof Cat) {
			Cat cat = (Cat) animal;
		} 
		// 강제 타입 변환 : 이전에 자동 타입 변환된 것이 아니면 ClassCastException 예외 발생
	}

}

class Animal {
}

class Dog extends Animal {
}

class Cat extends Animal {
}