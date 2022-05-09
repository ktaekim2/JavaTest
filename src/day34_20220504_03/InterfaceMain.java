package day34_20220504_03;

public class InterfaceMain {
	public static void main(String[] args) {

//		TestInterface interface1 = new TestInterface();
		// 인터페이스는 변수선언은 되지만 생성자가 없으므로 객체생성 불가능
		
		TestInterface impl1 = new ImplClass1();
		impl1.hello();
		impl1.hello2("바로핑");
		impl1 = new ImplClass2();
		impl1.hello();
		impl1.hello2("맛나핑");
		// 클래스가 달라도 똑같은 인터페이스의
		// 메서드를 상속받기 때문에 이름이 같아서
		// 바로 쓸 수 있음
		// 하나의 변수(impl1)가 ImplClass1의 객체였다가
		// ImplClass2의 객체가 되기도 함
		// 이걸 다형성이라고 함
		
		// List<String> list1 = new ArrayList<>();
		// List 인터페이스를 구현한 class가 ArrayList
		
		// ImplClass1으로 개발 하다가
		// ImplClass2로 바꿔야 하는 경우
		ImplClass1 implc1 = new ImplClass1();
		implc1.hello();
		implc1.hello2("차차핑");
		ImplClass2 implc2 = new ImplClass2();
		implc2.hello();
		implc2.hello2("차차핑");
		// 인터페이스 없이 클래스를 바꾸는 경우
		// 메서드 이름이 다르다거나 고칠게 많아서
		// 오류 발생 가능
		
	}
}
