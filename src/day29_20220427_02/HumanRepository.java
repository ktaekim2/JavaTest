package day29_20220427_02;

import java.util.*;

public class HumanRepository {

	static List<HumanDTO> humanList = new ArrayList<>();

	// 전달받은 매개변수를 humanList에 저장하는 save() 메소드 생성
	void save(HumanDTO human) {
		System.out.println("HumanRepository.save()");
		System.out.println(human);
		humanList.add(human);
	}

	// humanList를 출력할 findAll() 메서드 생성
	void findAll() {
		for (HumanDTO h : humanList) {
			System.out.println(h);
		}
	}

	// humanList를 return하기 위한 findAll1() 메서드
	List<HumanDTO> findAll1() {
		return humanList;
	}

	HumanDTO findById(Long id) {
		// id값과 일치하는 객체를 찾음
		// 한명의 정보를 찾아야 하기 때문에 리턴할 때 HumanDTO 객체가 필요
		HumanDTO human = null;
		// new로 객체 선언을 하면 기본값을 가짐: id = null, name = null, age = 0
		// 조회 결과 확인을 하면 기본값 정보를 가진 것으로 확인되어서 판별 불가능해지므로 null로 선언

		for (int i = 0; i < humanList.size(); i++) {
			if (id.equals(humanList.get(i).getId())) {
				human = humanList.get(i);
			}
		}
		return human;
	}

	void deleteById(Long id) {
		for (int i = 0; i < humanList.size(); i++) {
			if (id.equals(humanList.get(i).getId())) {
				humanList.remove(i);
			}
		}
	}

	List<HumanDTO> delete(Long id) {
		for (int i = 0; i < humanList.size(); i++) {
			if (id.equals(humanList.get(i).getId())) {
				humanList.remove(i);
			}
		}
		return humanList;
	}

	List<HumanDTO> update(Long id) {
		for (int i = 0; i < humanList.size(); i++) {
			if (id.equals(humanList.get(i).getId())) {
				humanList.get(i).setName("자바왕");
			}
		}
		return humanList;
	}

	public void update2(Long id, String name) {
		for (int i = 0; i < humanList.size(); i++) {
			if (id.equals(humanList.get(i).getId())) {
				humanList.get(i).setName(name);
			}
		}
		
	}
}
