package ch07;

public class P145 {
	
	public static void main(String[] args) {
		
		// Car 타입의 배열 객체 생성
		Car144[] cars = new Car144[3];
		
		// Car 객체 생성
		Car144 tico = new Car144();		
		tico.color = "화이트";
		tico.company = "대우";
		tico.type = "경차";
		
		// 모든 인덱스에 tico 객체 저장
		for (int i = 0; i < cars.length; i++) {
			cars[i] = tico;
		}
		
		System.out.println("2번 인덱스 color : "+cars[2].color);
		
		cars[0].color = "블랙";	// 0번 인덱스 객체의 color 필드에 "블랙" 대입
		
		System.out.println("2번 인덱스 color : "+cars[2].color);
		
	}
}
