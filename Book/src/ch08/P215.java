package ch08;

import ch08.Aclass;

class Bclass {
	
	public void methodB() {
		Aclass ac = new Aclass();
		ac.varA = "var4";	// ��� �Ұ�
		ac.varA2 = "varA2";	// ��� �Ұ�
		ac.methodA();		// ��� �Ұ�
		ac.methodA2();		// ��� �Ұ�
	}
}

class CClass extends Aclass {
	
	CClass() {
		this.varA = "var4";	// ��� ����
		this.varA2 = "varA2";	// ��� �Ұ�
		this.methodA();		// ��� ����
		this.methodA2();	// ��� �Ұ�
	}
}

public class P215 {

}
