package ch08;

public class P203 {
	
	String color;
	String name;
	
	public void go() {
		System.out.println("����");
	}
	
	void back() {
		System.out.println("����");
	}
}

class Taxi extends P203 {
	
	public void go() {
		System.out.println("���ͱ⸦ �Ѱ� ����");
	}
}
