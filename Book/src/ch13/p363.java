package ch13;

public class p363 implements Comparable {
	
	// 필드
	String name;
	int age;
	
	// 생성자
	p363(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// toString() 메서드 재정의
	@Override
	public String toString() {
		return "("+ name + ","+ age +")";
	}

	@Override
	public int compareTo(Object o) {
		p363 m = (p363)o;
		return this.name.compareTo(m.name);
	}
	

}
