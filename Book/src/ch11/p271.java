package ch11;

public class p271 {
	public static void main(String[] args) {
		
		System.out.println("DB���� ����");
		
		try {
			System.out.println("DB�۾�");
		} catch (Exception e) {
			System.out.println("DB�۾� �� ���ܹ߻�");
		} finally {
			System.out.println("DB���� ����");
		}
		
	}
}
