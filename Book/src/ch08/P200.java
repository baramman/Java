package ch08;

class Parent {
	
	int number = 3;
	
	Parent() {
		System.out.println("�θ� ��ü ����");
	}
}

class Child200 extends Parent {
	
	int number = 2;
	
	Child200() {
		System.out.println("�ڽ� ��ü ����");
	}
	
	void print() {
		int number = 1;
		System.out.println(number);			// �޼��� �������� number
		System.out.println(this.number);	// �ڽ� ��ü�� number
		System.out.println(super.number);	// �θ� ��ü�� number
	}
}

public class P200 {
	
	public static void main(String[] args) {
		
		Child200 child = new Child200();
		child.print();
	}
}
