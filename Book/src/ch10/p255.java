package ch10;

public class p255 {	// �ٱ� Ŭ����
	int i = 10;
	
	void outerMethod() {
		
		class Inner {	// ���� Ŭ����
			int x = 20;	// �޼��� ��������
			int i = 30;	// �޼��� ��������
			void innerMethod() {
				
				System.out.println(x);
				System.out.println(i);	// ���� Ŭ������ i����
				System.out.println(this.i);	// ���� Ŭ������ i����
				System.out.println(p255.this.i);	// �ٱ� Ŭ������ i����
			}
		}
		
		Inner inn = new Inner();
		inn.innerMethod();
	}
	
	public static void main(String[] args) {
		
		p255 lic = new p255();
		lic.outerMethod();
		
	}	
}
