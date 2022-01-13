package ch13;

public class p360 {
	
	// 필드
	String name;
	int age;
	
	// 생성자
	p360 (String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// toString() 메서드 재정의
	@Override
	public String toString() {
		return "(" +name+ "," +age+ ")";
	}
	
	// equals() 메서드 재정의
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof p360) {
			p360 m = (p360) obj;
			return this.name.equals(m.name) && this.age == m.age;
		} else {
			return false;
		}
	}
	
	// hashCode() 메서드 재정의
	@Override
	public int hashCode() {
		return this.name.hashCode() + age;
	}
	
}
