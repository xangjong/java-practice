package ch13_generic.sec11;

public class Student {
	int sno;
	String name;

	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student) obj;
			return( sno == std.sno) && (name.equals(std.name));
		} else 
			return false;
	}
	
	@Override
	public int hashCode() {
		// 학번과 이름이 같으면 동일한 값 리턴
		return sno + name.hashCode();
	}
	
}
