package day26_20220422;

public class HumanMain {

	public static void main(String[] args) {
		// Human 클래스에 대한 객체(인스턴스) 생성
		Human human1 = new Human();
		// [클래스이름] [객체이름(내맘대로)] = new [클래스 생성자]

		// human1 객체에 정보를 담아봅시다.
		System.out.println(human1.name);
		human1.name = "홍길동";
		System.out.println(human1.name);
		Human human2 = new Human();
		System.out.println(human2.name);
		
		Human human3 = new Human("가니?");
		
		Human human4 = new Human(10);
		
		String var1 = "ㅎㅎㅎ";
		Human human5 = new Human(var1);
		
		// human6 객체
		Human human6 = new Human("Tim horton", 70, "토론토", "남성");
		System.out.println(human6.name);
		System.out.println(human6.age);
		System.out.println(human6.local);
		System.out.println(human6.gender);
	}

}
