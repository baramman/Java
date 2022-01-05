package ch08;

public class P213 {
	
	public static void main(String[] args) {
		
		allObject(new GraphicCard209());
		allObject(new Amd209());
		allObject(new Nvidia209());
		allObject("¾È³ç");
		
	}
	
	public static void allObject(Object obj) {
		System.out.println(obj.toString());
	}

}
