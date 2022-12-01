package ch06_class.sec10;

public class StudentMain {

	public static void main(String[] args) {
		Student std = new Student("2022001", "홍길동", 1, 95);
		Student std2 = new Student("2021002", "성춘향", 2, 80);
		Student std3 = new Student("2019003", "이몽룡", 4, 88);

		System.out.println(std);
		System.out.println(std2);
		System.out.println(std3);

		/*
		 * Student[] std = new Student[3];
		 * 
		 * Student std[0] = new Student("2022001", "홍길동", 1, 95); 
		 * Student std[1] = new Student("2021002", "성춘향", 2, 80); 
		 * Student std[2] = new Student("2019003", "이몽룡", 4, 88);
		 */

	}

}
