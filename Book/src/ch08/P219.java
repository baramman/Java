package ch08;

public class P219 {
	
	String type;
	String name;
	
	P219(String type, String name) {
		this.name = type;
		this.name = name;
	}
	
	void sleep() {
		System.out.println(this.name +"��(��) ���� �ܴ�.");
	}
}

class Eagle extends P219 {

	Eagle(String type, String name) {
		super(type, name);
	}
	
	void sleep() {
		System.out.println(this.name +"��(��) �ϴÿ��� ���� �ܴ�.");
	}
}

class Tiger extends P219 {

	Tiger(String type, String name) {
		super(type, name);
	}
	
	void sleep() {
		System.out.println(this.name +"��(��) ��ӿ��� ���� �ܴ�.");
	}
}

class Lion extends P219 {

	Lion(String type, String name) {
		super(type, name);
	}
	
	void sleep() {
		System.out.println(this.name +"��(��) ���ӿ��� ���� �ܴ�.");
	}
}

class Shark extends P219 {

	Shark(String type, String name) {
		super(type, name);
	}
	
	void sleep() {
		System.out.println(this.name +"��(��) ���ӿ��� ���� �ܴ�.");
	}
}
