package ch10;

public class p260 {
	public static void main(String[] args) {
		
		p259 out = new p259();
		
		out.setInterfaceEx(new InterfaceExImple());
		out.outerMethod();
		out.setInterfaceEx(new InterfaceExImple2());
		out.outerMethod();
		
	}
}
