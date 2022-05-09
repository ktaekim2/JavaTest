package day34_20220504_03;

public class ImplClass2 implements TestInterface {

	@Override
	public void hello() {
		System.out.println("ImpleClass2.hello()");
	}

	@Override
	public void hello2(String name) {
		System.out.println("ImpleClass2.hello2()" + name);
	}

}
