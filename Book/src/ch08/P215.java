package ch08;

import ch08.Aclass;

class Bclass {
	
	public void methodB() {
		Aclass ac = new Aclass();
		ac.varA = "var4";	// 사용 불가
		ac.varA2 = "varA2";	// 사용 불가
		ac.methodA();		// 사용 불가
		ac.methodA2();		// 사용 불가
	}
}

class CClass extends Aclass {
	
	CClass() {
		this.varA = "var4";	// 사용 가능
		this.varA2 = "varA2";	// 사용 불가
		this.methodA();		// 사용 가능
		this.methodA2();	// 사용 불가
	}
}

public class P215 {

}
