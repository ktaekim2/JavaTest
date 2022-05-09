package day31_20220429_02;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeExample {

	public static void main(String[] args) {
		
		// 현재 날짜 출력하기
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		// 현재 시간 출력하기
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		String time = dateTime.format(DateTimeFormatter.ofPattern("yyyy년MM월dd일 HH:mm:ss"));
		System.out.println(time);
		
	}

}
