package ch09;

interface MyInterface1 {
	
	default void defaultMethod() {
		System.out.println("MyInterface1의 default 메서드");
	}

	static void staticMethod() {
		System.out.println("MyInterface1의 static 메서드");
	}
}

interface MyInterface2 {
	
	default void defaultMethod() {
		System.out.println("MyInterface2의 default 메서드");
	}

	static void staticMethod() {
		System.out.println("MyInterface2의 static 메서드");
	}
}

public class p245 {

}
