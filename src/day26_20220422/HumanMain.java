package day26_20220422;

public class HumanMain {

	public static void main(String[] args) {
		// Human Ŭ������ ���� ��ü(�ν��Ͻ�) ����
		Human human1 = new Human();
		// [Ŭ�����̸�] [��ü�̸�(�������)] = new [Ŭ���� ������]

		// human1 ��ü�� ������ ��ƺ��ô�.
		System.out.println(human1.name);
		human1.name = "ȫ�浿";
		System.out.println(human1.name);
		Human human2 = new Human();
		System.out.println(human2.name);
		
		Human human3 = new Human("����?");
		
		Human human4 = new Human(10);
		
		String var1 = "������";
		Human human5 = new Human(var1);
		
		// human6 ��ü
		Human human6 = new Human("Tim horton", 70, "�����", "����");
		System.out.println(human6.name);
		System.out.println(human6.age);
		System.out.println(human6.local);
		System.out.println(human6.gender);
	}

}
