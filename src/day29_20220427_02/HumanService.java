package day29_20220427_02;

import java.util.List;

public class HumanService {
	HumanRepository humanRepository = new HumanRepository();

	// HumanDTO class를 type으로 하는 save() 메서드 생성
	void save(HumanDTO human) {
		System.out.println("HumanService.save()");
		System.out.println(human);

		// human 객체를 Repository의 save 메서드로 넘김
		humanRepository.save(human);
	}

	// humanList를 출력할 메서드
	void findAll() {
		System.out.println("HumanService.findAll()");

		// humanList를 출력할 메서드에 접근하기 위한 객체 선언

		// HumanRepository의 findAll() 메서드 호출
		humanRepository.findAll();

		// humanList를 return 받아서 호출
		List<HumanDTO> humanList = humanRepository.findAll1();
		System.out.println("HumanService.findAll() for each문");
		for (HumanDTO h : humanList) {
			System.out.println(h);
		}
	}

	void findById(Long id) {
		System.out.println("넘어온 id값: " + id);
		HumanDTO human = humanRepository.findById(id);
		if (human == null) {
			System.out.println("조회결과가 없습니다.");
		} else {
			System.out.println("조회값: " + human);
		}
	}

	void deleteById(Long id) {
		System.out.println("삭제할 id값: " + id);
		humanRepository.deleteById(id);
		System.out.println("삭제완료");
	}

	public void delete(Long id) {
		List<HumanDTO> humanList = humanRepository.delete(id);
		System.out.println("삭제 후 리스트");
		for (HumanDTO human : humanList) {
			System.out.println(human);
		}
	}

	public void update(Long id) {
		List<HumanDTO> humanList = humanRepository.update(id);
		System.out.println("수정 후 리스트");
		for (HumanDTO human : humanList) {
			System.out.println(human);
		}
	}

	public void update2(Long id, String name) {
		humanRepository.update2(id, name);
		

	}
}
