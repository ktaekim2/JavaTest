package day33_20220503_02;

import java.util.HashMap;
import java.util.Map;

public class Ex01_MapExample {

	public static void main(String[] args) {

		// key: 정수(int), value: 문자(String)
		Map<Integer, String> map1 = new HashMap<>();
		// Map이라는 인터페이스의 map1이라는 객체선언

		// 저장
		map1.put(1, "안녕");
		map1.put(2, "안녕하세요");

		// 가져오기
		System.out.println(map1.get(1));
		System.out.println(map1.get(2));

		// key: 문자(String), value: 문자(String)
		Map<String, String> map2 = new HashMap<>();
		map2.put("하나", "ㅎㅇ");
		map2.put("둘", "ㅂㅂ");
		map2.put("하나", "ㅇㅎ"); // 덮어쓰기
		System.out.println(map2.get("하나"));
		System.out.println(map2.get("둘"));

		// 반복문에 활용 keySet()
		for (String s : map2.keySet()) { // key의 type
			System.out.println(s);
			System.out.println(map2.get(s));
		}
		
		// 삭제
		map2.remove("하나");
		
	}
}
