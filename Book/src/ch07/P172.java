package ch07;

public class P172 {
	
	//�ʵ�
	String name;	// �л���
	int grade;		// �г�
	String department;	// �а�
	
	// 1�� ������
	P172() {
		
	}
	
	// 2�� ������
	P172(String n) {
		name = n;
	}
	
	// 3�� ������
	P172(String n, int g) {
		name = n;
		grade = g;
	}
	
	// 4�� ������
	P172(String n, int g, String d) {
		name = n;
		grade = g;
		department = d;
	}
	/*
	// �а��� �г��� �Ű������� �޴� ������ (���� �߻�)
	P172(String d, int g) {
		department = d;
		grade = g;
	}	*/
}
