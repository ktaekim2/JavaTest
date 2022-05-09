package day28_20220426_01;

public class Member2 {
	long id;
	String memberId;
	String memberPassword;
	String memberName;
	String memberPhone;
	int memberAge;

	// 기본생성자
	Member2() {

	}

	// 모든 필드를 매개변수로 하는 생성자
	Member2(long id, String memberId, String memberPassword, String memberName, String memberPhone, int memberAge) {
		this.id = id;
		this.memberId = memberId;
		this.memberPassword = memberPassword;
		this.memberName = memberName;
		this.memberPhone = memberPhone;
		this.memberAge = memberAge;
	}

	void findById() {
		System.out.println(this.id);
		System.out.println(this.memberId);
		System.out.println(this.memberPassword);
		System.out.println(this.memberName);
		System.out.println(this.memberPhone);
		System.out.println(this.memberAge);
	}

	boolean memberLogin(String memberId, String memberPassword) {
		boolean loginResult = false;
		if (this.memberId.equals(memberId) && this.memberPassword.equals(memberPassword)) {
			loginResult = true;
		} else {
			loginResult = false;
		}
		return loginResult;
	}

	void update(String memberPhone) {
		this.memberPhone = memberPhone;
	}

}
