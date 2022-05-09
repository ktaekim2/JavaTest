package day28_20220426_01;

import java.util.Scanner;

public class Member {
//	  1. 회원은 회원번호, 아이디, 비밀번호, 이름, 전화번호, 나이 정보를 가진다. 
//	    2. 주요기능 
//	        1. 회원가입(save)
//	            1. 회원가입시 두가지 방법이 있음. 
//	                1. 객체를 만들 때 모든 정보를 매개변수로 전달하여 필드값 지정하기 
//	                2. 객체를 만들고 난 후 필드값을 각각 지정하기  
//	        2. 로그인(memberLogin)
//	            1. 로그인 메서드를 호출할 때 가입시 입력한 아이디, 비밀번호를 매개변수로 전달하고 boolean 리턴을 받아서 로그인 성공, 실패 여부를 출력함. 
//	        3. 회원조회(findById)
//	            1. 해당 객체의 회원조회 메서드를 호출하면 해당 회원의 전체 정보를 출력함. 
//	        4. 정보수정(update)
//	            1. 정보수정은 전화번호만 된다고 가정하고 
//	            2. 정보수정 메서드 호출시 변경하고자 하는 전화번호를 매개변수로 넘겨서 해당 필드값을 변경하도록 한다. 
//	            3. 변경 후 회원조회 메서드를 호출하여 값이 변경됐는지 확인함.

	// 필드값
	int dbIdNum;
	String dbId;
	String dbPw;
	String dbName;
	String dbTel;
	int dbAge;

	void save1(int idNum, String id, String pw, String name, String tel, int age) {
		this.dbIdNum = idNum;
		this.dbId = id;
		this.dbPw = pw;
		this.dbName = name;
		this.dbTel = tel;
		this.dbAge = age;
	}

	void save2() {
		Scanner scan = new Scanner(System.in);
		System.out.print("회원번호: ");
		dbIdNum = scan.nextInt();
		scan.nextLine();
		System.out.print("아이디: ");
		dbId = scan.nextLine();
		System.out.print("비밀번호: ");
		dbPw = scan.next();
		scan.nextLine();
		System.out.print("이름: ");
		dbName = scan.nextLine();
		System.out.print("전화번호: ");
		dbTel = scan.nextLine();
		System.out.print("나이: ");
		dbAge = scan.nextInt();
	}

	boolean memberLogin(String id, String pw) {
		if (this.dbId.equals(id)) {
			if (this.dbPw.equals(pw)) {
				return true;
			} else {
				System.out.println("비밀번호가 틀렸습니다.");
				return false;
			}
		} else {
			return false;
		}
	}

	void findById() {
		System.out.println("회원번호: " + this.dbIdNum);
		System.out.println("아이디: " + this.dbId);
		System.out.println("비밀번호: " + this.dbPw);
		System.out.println("이름: " + this.dbName);
		System.out.println("전화번호: " + this.dbTel);
		System.out.println("나이: " + this.dbAge);
	}

	void update(String tel) {
		dbTel = tel;
		findById();
	}
}
