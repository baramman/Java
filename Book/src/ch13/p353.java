package ch13;

import java.util.ArrayList;
import java.util.List;

public class p353 {
	public static void main(String[] args) {
		
		List list = new ArrayList();
		// list ��ü�� ��� �߰�
		list.add(new Circle(3.0));
		list.add(new Rectangle(3, 4));
		list.add(new Circle(5));
		list.add(new Rectangle(5, 6));
		
		System.out.println("��ü ������ ������ �� : "+getArea(list));
		System.out.println("��ü ������ �ѷ��� �� : "+getLength(list));
	}

	private static double getLength(List list) {
		double value = 0;
		
		for (int i = 0; i < list.size(); i++) {
			// list ��ü ����ȯ
			Shape s = (Shape) list.get(i);
			value += s.length();
		}		
		return value;
	}

	private static double getArea(List list) {
		double value = 0;
		
		for (int i = 0; i < list.size(); i++) {
			// list ��ü ����ȯ�� �޼��� ȣ�� ���ÿ�
			value += ((Shape)list.get(i)).area();
		}
	
		return value;
	}
}
