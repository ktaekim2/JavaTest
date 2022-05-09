package day34_20220504_02;

public class InheritanceMain {

	public static void main(String[] args) {
		
		// 부모 클래스 객체
		ParentClass parent = new ParentClass();
		ParentClass parent1 = new ParentClass("하츄핑", "인천");
		
		// 자식 클래스 객체
		ChildClass child = new ChildClass();
		ChildClass child1 = new ChildClass("방글핑", "서울");
		
		// 부모클래스의 hello메서드 사용
		child.hello(); 
		
		System.out.println(child.getName());
		System.out.println(child1.getName());
		System.out.println(child.name);
		System.out.println(child1.name);
		
		
	}

}
