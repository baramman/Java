package ch05;
/*
 *  ��¥ : 2022/01/05
 *  �̸� : �缺��
 *  ���� : �ڹ� Static �ǽ��ϱ� ���� p148
 *  
 *  ��������(Ŭ���� ����)
 *   - Ŭ�������� static�� ������ �������
 *   - �޸𸮿��� �ϳ��� ������ ����
 *   - Ŭ���� Ÿ��(��ü���� X)���� ���� ���� �� �� �ִ�.
 *  
 *  �����޼���(Ŭ���� �޼���)
 *   - Ŭ�������� static�� ������ ����޼���
 *   - �޸𸮿��� �ϳ��� �޼���� ����
 *   - Ŭ���� Ÿ��(��ü���� X)���� ���� ȣ�� �� �� �ִ�.
 */
public class Sub2_StaticTest {
	
	public static void main(String[] args) {
		
		Increment inc1 = new Increment();
		Increment inc2 = new Increment();
		Increment inc3 = new Increment();
		
		// ��������, �����޼���� Ŭ���� �̸����� ���� ������ �� �ִ�.
		Increment.num2 = 0;
		Increment.add();
	}
}