package ch07;

public class P145 {
	
	public static void main(String[] args) {
		
		// Car Ÿ���� �迭 ��ü ����
		Car144[] cars = new Car144[3];
		
		// Car ��ü ����
		Car144 tico = new Car144();		
		tico.color = "ȭ��Ʈ";
		tico.company = "���";
		tico.type = "����";
		
		// ��� �ε����� tico ��ü ����
		for (int i = 0; i < cars.length; i++) {
			cars[i] = tico;
		}
		
		System.out.println("2�� �ε��� color : "+cars[2].color);
		
		cars[0].color = "��";	// 0�� �ε��� ��ü�� color �ʵ忡 "��" ����
		
		System.out.println("2�� �ε��� color : "+cars[2].color);
		
	}
}
