package ch07;

public class P146 {
	
	public static void main(String[] args) {
		
		// Car Ÿ���� �迭 ��ü ����
		Car144[] cars = new Car144[3];
				
		// ��� �ε����� new �����ڷ� ��ü ���� �� ����
		for (int i = 0; i < cars.length; i++) {
			cars[i] = new Car144();
			cars[i].color = "ȭ��Ʈ";
			cars[i].company = "���";
			cars[i].type = "����";
		}
		
		System.out.println("0�� �ε��� color : "+cars[0].color);
		System.out.println("1�� �ε��� color : "+cars[1].color);
		System.out.println("2�� �ε��� color : "+cars[2].color);
		
		cars[0].color = "��";

		System.out.println("0�� �ε��� color : "+cars[0].color);
		System.out.println("1�� �ε��� color : "+cars[1].color);
		System.out.println("2�� �ε��� color : "+cars[2].color);
		
	}
}
