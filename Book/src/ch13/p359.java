package ch13;

import java.util.HashSet;
import java.util.Set;

public class p359 {
	public static void main(String[] args) {
		
		// HashSet ��ü ����
		Set set = new HashSet();
		
		// ���ڿ� ��ü �ΰ� �߰�
		set.add(new String("abc"));
		set.add(new String("abc"));
		
		// Member ��ü �ΰ� �߰�(����� ���� Ŭ����)
		set.add(new p360("ȫ�浿", 40));
		set.add(new p360("ȫ�浿", 40));
		
		// ���
		System.out.println(set);
	}
}
