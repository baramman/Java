package ch09;

interface MyInterface1 {
	
	default void defaultMethod() {
		System.out.println("MyInterface1�� default �޼���");
	}

	static void staticMethod() {
		System.out.println("MyInterface1�� static �޼���");
	}
}

interface MyInterface2 {
	
	default void defaultMethod() {
		System.out.println("MyInterface2�� default �޼���");
	}

	static void staticMethod() {
		System.out.println("MyInterface2�� static �޼���");
	}
}

public class p245 {

}
