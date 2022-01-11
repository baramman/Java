package ch09;

class Parent {
	public void method2() {
		System.out.println("Parent 클래스의 method2()");
	}
}

class Child extends Parent implements MyInterface1, MyInterface2 {

	@Override
	public void defaultMethod() {
		System.out.println("Child 클래스의 default 메서드");
		MyInterface1.super.defaultMethod();
		MyInterface2.super.defaultMethod();
	}
	
}

public class p246 {

}
