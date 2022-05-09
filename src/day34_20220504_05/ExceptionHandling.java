package day34_20220504_05;

import java.util.ArrayList;
import java.util.List;

public class ExceptionHandling {

	public static void main(String[] args) {

		try {
			List<String> list = new ArrayList<>();
			list.add("안녕");
			list.add("하이");
			for (int i = 0; i <= list.size(); i++) {
				System.out.println(list.get(i));
			}
			System.out.println("실행 안됨");
		} catch (IndexOutOfBoundsException e) { // e: 매개변수
			System.out.println("IndexOutOfBoundsException 예외 발생!!");
			e.printStackTrace();
		} catch (Exception e) { // 모든 exception 대상
			System.out.println("Exception 예외 발생!");
		} finally {
			System.out.println("여기는 예외 발생하든 안하든 실행");
		}
		System.out.println("리스트 출력 끝"); // try-catch 끝난 이후 코드는 계속 실행됨
	}

}
