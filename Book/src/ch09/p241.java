package ch09;

public class p241 {
	public static void main(String[] args) {
		
		Animal eagle = new Eagle();
		
		eagle.sleep();
		//eagle.eat();	// ����
		
		Eagle eagleobj = (Eagle)eagle;	// ���� ����ȯ
		eagleobj.eat();	// Eagle Ŭ������ eat() �޼���
		
	}
}
