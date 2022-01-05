package ch08;

class GraphicCard209 {
	int memory;
	
	public void process() {
		System.out.println("그래픽 처리");
	}
}

class Amd209 extends GraphicCard209 {
	
	public void process() {
		System.out.println("AMD 그래픽 처리");
	}
}

class Nvidia209 extends GraphicCard209 {
	
	public void process() {
		System.out.println("Nvidia 그래픽 처리");
	}
}

public class P209 {

}
