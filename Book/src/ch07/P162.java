package ch07;

class Operator162 {
	
	int multiply(int x, int y) {
		return x * y;
	}
}

public class P162 {
	
	public static void main(String[] args) {
		
		Operator162 op = new Operator162();
		
		System.out.println(op.multiply(4, 3));
	}
}
