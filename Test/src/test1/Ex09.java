package test1;
/*
 * ��¥ : 2022/01/06
 * �̸� : �缺��
 * ���� : �ڹ� �ݺ��� ��������
 */
public class Ex09 {
	public static void main(String[] args) {
		
		int count = 0;
		
		for (int i = 1; i <= 9; i++) {
			
			if (i<=5) {
				count++;
			} else {
				count--;
			}
			
			for (int j = 1; j <= 5-count; j++) {
				System.out.print(" ");
			}
			
			for (int k = 1; k <= 2*count-1; k++) {
				System.out.print("*");
			}
			
			System.out.print("\n");
		}
	}
}