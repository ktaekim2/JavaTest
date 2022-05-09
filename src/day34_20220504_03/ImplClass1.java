package day34_20220504_03;

// TestInterface의 구현클래스로 선언
public class ImplClass1 implements TestInterface {
	// 구현클래스로 상속 받으려면 추상메서드를 구현해야함
	
	@Override
	public void hello() {
		System.out.println("ImpleClass.hello()");
	}

	@Override
	public void hello2(String name) {
		System.out.println("ImpleClass.hello2()" + name);
	}
	
	
}
