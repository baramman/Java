package ch08;

public class P210 {
	
	public static void main(String[] args) {
		
		GraphicCard209 gc = new GraphicCard209();
		gc.process(); // ���� �׷���ī�� process
		
		gc = new Amd209();
		gc.process();
		
		gc = new Nvidia209();
		gc.process();
	}
}
