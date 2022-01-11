package ch09;

public interface p238 {
	
	String MEMORY = "2G";
	
	public void process();
	
}

class Amd implements p238 {
	
	public void process() {
		System.out.println("AMD 그래픽 처리");
	}
	
}

class Nvidia implements p238 {
	
	public void process() {
		System.out.println("Nvidia 그래픽 처리");
	}
	
}
