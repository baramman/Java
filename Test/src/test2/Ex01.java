package test2;
/*
 * ��¥ : 2022/01/06
 * �̸� : �缺��
 * ���� : �ڹ� �迭 ���� ��� ��������
 */
public class Ex01 {
	public static void main(String[] args) {
		
		char str[] = {'I', ' ', 'L', 'O', 'B', 'E', ' ', 'Y', 'O', 'U'};
		int row, col;
		
		for (row = 1; row < 10; row++) {
			
			for (col = 0; col <= row; col++) {
				
				System.out.print(str[col]);
				
			}
			
			System.out.print("\n");
			
		}
	}
}