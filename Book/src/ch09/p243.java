package ch09;

interface A {
	void a();
}

interface AA extends A {
	void aa();
}

class AAA implements AA {

	@Override
	public void a() {
		
	}

	@Override
	public void aa() {
		
	}
	
}

interface AB extends A {
	void ab();
}

class ABB implements AB {

	@Override
	public void a() {
		
	}

	@Override
	public void ab() {
		
	}
	
}

public class p243 {

}
