package ch08;

class Parent {
	
	int number = 3;
	
	Parent() {
		System.out.println("부모 객체 생성");
	}
}

class Child200 extends Parent {
	
	int number = 2;
	
	Child200() {
		System.out.println("자식 객체 생성");
	}
	
	void print() {
		int number = 1;
		System.out.println(number);			// 메서드 지역변수 number
		System.out.println(this.number);	// 자신 객체의 number
		System.out.println(super.number);	// 부모 객체의 number
	}
}

public class P200 {
	
	public static void main(String[] args) {
		
		Child200 child = new Child200();
		child.print();
	}
}
