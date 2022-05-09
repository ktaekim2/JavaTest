package day28_20220426_03;

import java.util.ArrayList;
import java.util.List;

public class Ex01_ArrayListEx {

	public static void main(String[] args) {
		// String 객체를 담기위한 ArrayList
		List<String> list1 = new ArrayList<>();

		// 저장: add 메서드
		list1.add("hello");
		list1.add("hihi");
		list1.add(1, "kkkk"); // 1: 인덱스번호
		list1.add(1, "oooo");

		// 꺼내기: get 메서드
		System.out.println(list1.get(0));
		System.out.println(list1.get(1));
		System.out.println(list1.get(2)); // 배열과 다르게 크기 지정 없이 넣는많큼 늘어남
		System.out.println(list1.get(3));

		// 크기확인: size 메서드
		System.out.println(list1.size());

		// 삭제: remove 메서드
		System.out.println(list1.get(1));
		list1.remove(1);
		System.out.println(list1.get(1));

		// for문을 이용하여 list에 담긴 내용 모두 출력하기
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}

		// for each
		for (String a : list1) { // list1에 저장된 값을 순서대로 a에 대입
			System.out.println(a);
		}
		
		// 정수를 담는 list
		// Wrapper class
		// int-Integer, long-Long, double-double, boolean-Boolean
		List<Integer> list2 = new ArrayList<>();
		list2.add(10);
		list2.add(20);
		System.out.println(list2.get(0));
		for(Integer num: list2) {
			System.out.println(num);
		}
	}

}
