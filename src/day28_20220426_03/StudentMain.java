package day28_20220426_03;

import java.util.ArrayList;
import java.util.List;

public class StudentMain {

	public static void main(String[] args) {
		Student student1 = new Student();

//		// getter/setter 사용전
//		student1.id = 1L; // field값 지정
//		System.out.println(student1.id); // field값 출력

		// getter/setter 적용
		student1.setId(1L);
		System.out.println(student1.getId());

		// 연습
		Student student2 = new Student();
		student2.setId(2L);
		student2.setStudentNumber("11223344");
		student2.setStudentName("학생2");
		student2.setStudentMajor("컴퓨터공학");
		System.out.println(student2.getId());
		System.out.println(student2.getStudentNumber());
		System.out.println(student2.getStudentName());
		System.out.println(student2.getStudentMajor());

		// Student 객체를 담기 위한 list
		List<Student> studentList = new ArrayList<>();
		studentList.add(student2);

		// get
		System.out.println("리스트 객체만 출력: " + studentList.get(0));
		System.out.println("객체출력: " + student2);
		// 같은 곳을 바라보기 때문에 주소값이 같다.
		
		// 0번 인덱스에 담긴 Student 객체의 id값을 출력한다면
		System.out.println(studentList.get(0).getId());

		// for문을 이용해서 studentList에 담긴 모든 학생의 이름 출력
		Student student3 = new Student();
		student3.setId(3L);
		student3.setStudentNumber("99999999");
		student3.setStudentName("학생3");
		student3.setStudentMajor("전자공학");
		studentList.add(student3);

		for (int i = 0; i < studentList.size(); i++) {
			System.out.println(studentList.get(i).getStudentName());
		}

		for (Student stu : studentList) {
			System.out.println(stu.getStudentName());
		}
	}

}
