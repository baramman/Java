package ch09;

interface Printer {
	
	int INK = 100;
	void print();

}

interface Scanner {
	
	void scan();
	
}

interface Fax {
	
	String FAX_NUMBER = "02-1234-5678";
	void send(String tel);
	void receive(String tel);
	
}

public class p232 {
	
}
