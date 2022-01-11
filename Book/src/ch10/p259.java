package ch10;

public class p259 {
	
	interface InterfaceEx {
		void method();
	}
	
	InterfaceEx ie;

	void setInterfaceEx(InterfaceEx ie) {
		this.ie = ie;
	}
	
	void outerMethod() {
		ie.method();
	}
	
}

class InterfaceExImple implements p259.InterfaceEx {
	
	@Override
	public void method() {
		System.out.println("InterfaceExImple method()");
	}
}

class InterfaceExImple2 implements p259.InterfaceEx {
	
	@Override
	public void method() {
		System.out.println("InterfaceExImple2 method()");
	}
}
