package day26_20220422;

public class StudentMain {

	public static void main(String[] args) {
		Student student1 = new Student();
//		System.out.println(student1.name);
//		System.out.println(student1.major);
//		System.out.println(student1.studentNumber);
//		System.out.println(student1.age);
		student1.name = "김이름";
		student1.major = "메이전공";
		student1.studentNumber = "9999";
		student1.age = 99;
		student1.studentPrint();
		
		
		Student student2 = new Student("이이름", 25);
//		System.out.println(student2.name);
//		System.out.println(student2.major);
//		System.out.println(student2.studentNumber);
//		System.out.println(student2.age);
		student2.studentPrint();
		
		Student student3 = new Student("박이름", "오징어심리학과", "5941", 24);
//		System.out.println(student3.name);
//		System.out.println(student3.major);
//		System.out.println(student3.studentNumber);
//		System.out.println(student3.age);
		student3.studentPrint();
	}

}
