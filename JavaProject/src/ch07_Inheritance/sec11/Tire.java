package ch07_Inheritance.sec11;

public class Tire {
	public int maxRotation;  				// 최대 회전수(최대 수명)
	public int accumulatedRotation; 	// 누적 회전수
	public String location;					// 타이어 위치
	
	// 생성자
	public Tire(int maxRotation, String location) {
		this.maxRotation = maxRotation;
		this.location = location;
	}
	
   public boolean roll() {
	   ++accumulatedRotation;
	   if(accumulatedRotation < maxRotation ) {
		   System.out.println(location + " Tire 수명 : " + 
				   (maxRotation-accumulatedRotation) + "회");
		   return true;
	   } else {
		   System.out.println("*** " + location + " Tire 평크 ***");
		   return false;
	   }
   }
}