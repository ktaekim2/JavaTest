package day26_20220422;

public class Student {
	String name;
	String major;
	String studentNumber; // 앞자리 0일수도 있어서
	int age;
	
	// 기본생성자
	Student() {
		
	}
	
	Student(String name, int age) {
		this.name = name;
		this.age = age;
		this.major = "Computer Science";
		this.studentNumber = "1234";
	}
	
	Student(String name, String major, String studentNumber, int age) {
		this.name = name;
		this.age = age;
		this.major = major;
		this.studentNumber = studentNumber;
	}
	
	// 필드값 출력을 위한 메서드
	void studentPrint() {
		System.out.println(this.name);
		System.out.println(this.major);
		System.out.println(this.studentNumber);
		System.out.println(this.age);
	}
	
	
	
	
	
	
	
	
	
}
