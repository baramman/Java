package ch12;

public class p296 {
	public static void main(String[] args) {
		
		int score = 90;
		System.out.println("����� ������ "+ score + "�Դϴ�.");	// �ڵ�����ȯ
		
		//String s = score;	// ������Ÿ���� �޶� ����
		String s = String.valueOf(score);	// String���� ����ȯ
		
		// ���ڿ��� + �����Ͽ� String���� ����ȯ
		String s2 = score + "";		
	}
}