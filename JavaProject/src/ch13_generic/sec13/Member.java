package ch13_generic.sec13;

public class Member {
	String id;
	String passwd;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public Member(String id, String passwd) {
		this.id = id;
		this.passwd = passwd;
	}

}
