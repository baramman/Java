package ch09;

class Parent {
	public void method2() {
		System.out.println("Parent Ŭ������ method2()");
	}
}

class Child extends Parent implements MyInterface1, MyInterface2 {

	@Override
	public void defaultMethod() {
		System.out.println("Child Ŭ������ default �޼���");
		MyInterface1.super.defaultMethod();
		MyInterface2.super.defaultMethod();
	}
	
}

public class p246 {

}
