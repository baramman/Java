package ch09;

public class p234 {
	public static void main(String[] args) {
		
		p233 com = new p233();
		
		System.out.println(p233.INK);
		System.out.println(p233.FAX_NUMBER);
		
		com.print();
		com.scan();
		com.send("02-8765-4321");
		com.receive("02-8765-4321");
		
	}
}
