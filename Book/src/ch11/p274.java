package ch11;

public class p274 {
	public static void main(String[] args) {
		
		try {
			first();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	static void first() throws Exception {
		second();
	}

	static void second() throws Exception {
		throw new Exception("���� �߻�");
	}
	
}
