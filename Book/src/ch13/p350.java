package ch13;

import java.util.Vector;

public class p350 {
	public static void main(String[] args) {
		
		Vector list = new Vector();
		
		list.add(1.2);	// List �޼���
		list.add(Math.PI);	// List �޼���
		list.addElement(3.4);	// ���� �޼���
		
		// ���� for��
		for (Object o : list) {
			System.out.println(o);
		}
		double num = 3.4;
		
		// �ش� ����� �ε��� (������ -1)
		int index = list.indexOf(num);
		if (index >= 0) {	// ��Ұ� ������
			System.out.println(num+" �� ��ġ : "+index);
		} else {	// �������� ����
			System.out.println(num+" �� list�� �����ϴ�.");
		}
		
		num = 1.2;
		// ���� �����ϴ��� Ȯ��
		if (list.contains(num)) {
			// ����(���� �޼���)
			list.removeElement(num);
			System.out.println(num+" ������");
		}
		
		// �ش� ����� �ε��� (������ -1)
		System.out.println(list.indexOf(num));
		System.out.println(list);	// toString()	
	}
}
