package ch07;
/*
 * 날짜 : 2022/01/06
 * 이름 : 양성민
 * 내용 : 자바 인터페이스 실습하기 교재 p288
 */
public class InterfaceTest {

	public static void main(String[] args) {
		
		// 인터페이스로 공통 클래스 구조 설계
		RemoteControl lg      = new RemoteLG();
		RemoteControl samsung = new RemoteSamsung();
		
		lg.powerOn();
		lg.chDown();
		lg.soundDown();
		lg.powerOff();
		
		samsung.powerOn();
		samsung.chUp();
		samsung.soundUp();
		samsung.powerOff();
		
		// 인터페이스를 이용한 결합도 완화
		Bulb bulb = new Bulb();
		Socket socket = new Cable(bulb);	// Cable을 Socket으로 업캐스팅
		
		socket.switchOn();
		socket.switchOff();
		
	}
}
