package ch07_Inheritance.sec12;

public class CourseMain {

	public static void main(String[] args) {
		Course[] c = new Course[3];
		System.out.println("정보 입력");
		for(int i=0; i<c.length; i++) { 
			c[i] = new Course(); 
			c[i].input();
		}
		System.out.println("정보 출력 ");
		for(int i=0; i<c.length; i++) { 
			c[i].output();
		}
		Course.sc.close();
	}

}