package ch08;

public class P208 {
	
	public static void main(String[] args) {
		
		P206 p = new Child207();
		p.run();
		
		// �ڽ�Ŭ������ �ڷ������� ��ȯ(��������ȯ)
		Child207 c = (Child207)p;
		c.eat();
	}
}
