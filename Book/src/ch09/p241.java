package ch09;

public class p241 {
	public static void main(String[] args) {
		
		Animal eagle = new Eagle();
		
		eagle.sleep();
		//eagle.eat();	// 에러
		
		Eagle eagleobj = (Eagle)eagle;	// 강제 형변환
		eagleobj.eat();	// Eagle 클래스의 eat() 메서드
		
	}
}
