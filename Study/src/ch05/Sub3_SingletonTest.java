package ch05;
/*
 *  날짜 : 2022/01/06
 *  이름 : 양성민
 *  내용 : 자바 싱글톤 객체 실습하기 교재 p185
 */
public class Sub3_SingletonTest {
	
	public static void main(String[] args) {
		
		Calc c = Calc.getInstance();
		
		int r1 = c.plus(1, 2);
		int r2 = c.minus(1, 2);
		int r3 = c.multi(2, 3);
		int r4 = c.div(4, 2);
		
		System.out.println("r1 : "+r1);
		System.out.println("r1 : "+r2);
		System.out.println("r1 : "+r3);
		System.out.println("r1 : "+r4);
		
	}
}
