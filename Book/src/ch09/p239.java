package ch09;

public class p239 {
	public static void main(String[] args) {
		
		p238 gc = new Amd();
		
		System.out.println("�޸� : "+gc.MEMORY);
		
		// AMD�� ����
		gc = new Amd();	// �ڵ� ����ȯ
		gc.process();
		
		// Nvidia�� ��ü
		gc = new Nvidia();	// �ڵ� ����ȯ
		gc.process();
		
	}
}
