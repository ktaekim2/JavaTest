package day26_20220422;

public class Student {
	String name;
	String major;
	String studentNumber; // ���ڸ� 0�ϼ��� �־
	int age;
	
	// �⺻������
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
	
	// �ʵ尪 ����� ���� �޼���
	void studentPrint() {
		System.out.println(this.name);
		System.out.println(this.major);
		System.out.println(this.studentNumber);
		System.out.println(this.age);
	}
	
	
	
	
	
	
	
	
	
}
