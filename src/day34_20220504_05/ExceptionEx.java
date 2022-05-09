package day34_20220504_05;

public class ExceptionEx {

	public static void main(String[] args) {

		// 숫자/0을 했을 때 발생하는 예외를 확인하여 이에 대한 예외처리 코드를 작성해봅시다.
		try {
//			System.out.println(5 / 0);
			String a = null;
			System.out.println(a.length());
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException 예외 발생");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Exception 예외 발생!");
		} finally {
			System.out.println("후후");
		}
		System.out.println("끝");

	}

}
