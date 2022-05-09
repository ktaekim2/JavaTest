package day29_20220427_02;

public class HumanMain {

	public static void main(String[] args) {

		// HumanRepository의 humanList에 새로운 객체를 저장해봅시다.

		// 새로운 HumanDTO 타입의 객체 human1 등록
		HumanDTO human1 = new HumanDTO(1L, "휴먼1", 24);

		// HumanService class에 human1 객체를 넘기기 위해 humanService 객체 생성
		HumanService humanService = new HumanService();

		// save() 메서드 호출, human1 객체를 매개변수로 넘김
		humanService.save(human1);

		// humanList에 담긴 데이터 조회
		humanService.findAll();

		// 새로운 휴먼 등록
		HumanDTO human2 = new HumanDTO(2L, "휴먼2", 25);
		humanService.save(human2);
		HumanDTO human3 = new HumanDTO(3L, "휴먼3", 33);
		humanService.save(human3);

		// id가 1인 사람 조회, Service에서 출력
		humanService.findById(1L);

		// id가 4인 사람 조회, Service에서 출력
		humanService.findById(4L); // 조회결과가 없습니다.

		// id가 1인 사람 삭제(내가만든거)
		System.out.println("삭제전");
		humanService.findAll();
		humanService.deleteById(1L);
		System.out.println("삭제후");
		humanService.findAll();

		// id가 2인 사람 삭제(선생님)
		humanService.delete(2L);
		
		// id가 3인 사람의 이름을 자바왕으로 바꾸자.(내가한거)
		humanService.update(3L);
		
		// id가 3인 사람의 이름을 자바왕으로 바꾸자.(선생님)
		humanService.update2(3L, "java_king");
		System.out.println("수정후");
		humanService.findAll();

	}

}
