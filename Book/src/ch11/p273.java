package ch11;

public class p273 {
	public static void main(String[] args) {
		
		System.out.println("���α׷� ����");
		
		try {
			throw new Exception("���� �߻�");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("���α׷� ����");
		
	}
}