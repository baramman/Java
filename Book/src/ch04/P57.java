package ch04;

public class P57 {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 10;
		
		++a;	// ��������
		b++;	// ��������
		
		System.out.println(a);
		System.out.println(b);
		
		int c = 10;
		int d = ++c;		
		System.out.println("�������� ��� : "+d);
		
		int x = 10;
		int y = x++;
		System.out.println("�������� ��� : "+y);
		System.out.println("x : "+x);
		
		int A = 10;
		A++;
		System.out.println("A++ : " + A);
		int B = 10;
		B += 1;
		System.out.println("B += 1 : " + B);
		int C = 10;
		C = C + 1;
		System.out.println("C = C + 1 : " + C);
		
	}

}
