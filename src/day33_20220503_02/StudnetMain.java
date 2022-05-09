package day33_20220503_02;

import java.util.HashMap;
import java.util.Map;

public class StudnetMain {

	public static void main(String[] args) {

		/*
		 * StudentDTO를 만들어서 이름, 전화번호, 전공 필드를 만들고 main 메서드에서 student객체를 담을 수 있는
		 * studentMap을 선언하여 두 학생의 정보를 map에 저장하고 반복문으로 출력해보기 key값은 관리번호를 넣기로 함
		 */

		Map<Long, StudentDTO> studentMap = new HashMap<>();
		Long id = 0L;
		String studentName = "학생1";
		String studentMobile = "010-1111-1111";
		String major = "컴퓨터공학";
		StudentDTO student = new StudentDTO(id, studentName, studentMobile, major);
		studentMap.put(id, student);

		id = 1L;
		studentName = "학생2";
		studentMobile = "010-2222-2222";
		major = "전자공학";
		student = new StudentDTO(id, studentName, studentMobile, major);
		studentMap.put(id, student);

		for (Long l : studentMap.keySet()) {
			System.out.println(l);
			System.out.println(studentMap.get(l));
			System.out.println(studentMap.get(l).getStudentName());
			System.out.println(studentMap.size());
		}

		for (Long i = 0L; i < studentMap.size(); i++) {
			System.out.println(studentMap.get(i));
		}
	}

}
