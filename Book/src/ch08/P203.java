package ch08;

public class P203 {
	
	String color;
	String name;
	
	public void go() {
		System.out.println("전진");
	}
	
	void back() {
		System.out.println("후진");
	}
}

class Taxi extends P203 {
	
	public void go() {
		System.out.println("미터기를 켜고 전진");
	}
}
