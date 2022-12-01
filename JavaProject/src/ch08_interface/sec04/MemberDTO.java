package ch08_interface.sec04;

public class MemberDTO {
	// 필드
	private String memId;
	private String memPass;
	private String memName;
	private String memPhone;
	private String memAddress;

	// 생성자
	public MemberDTO(String memId, String memPass, String memName, String memPhone, String memAdress) {
		super();
		this.memId = memId;
		this.memPass = memPass;
		this.memName = memName;
		this.memPhone = memPhone;
		this.memAddress = memAdress;
	}
	// Getter & Setter
	public String getMemId() {
		return memId;
	}

	public void setMemId(String memId) {
		this.memId = memId;
	}

	public String getMemPass() {
		return memPass;
	}

	public void setMemPass(String memPass) {
		this.memPass = memPass;
	}

	public String getMemName() {
		return memName;
	}

	public void setMemName(String memName) {
		this.memName = memName;
	}

	public String getMemPhone() {
		return memPhone;
	}

	public void setMemPhone(String memPhone) {
		this.memPhone = memPhone;
	}

	public String getMemAdress() {
		return memAddress;
	}

	public void setMemAdress(String memAdress) {
		this.memAddress = memAdress;
	}

	
}
