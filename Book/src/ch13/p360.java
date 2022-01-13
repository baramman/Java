package ch13;

public class p360 {
	
	// �ʵ�
	String name;
	int age;
	
	// ������
	p360 (String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// toString() �޼��� ������
	@Override
	public String toString() {
		return "(" +name+ "," +age+ ")";
	}
	
	// equals() �޼��� ������
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof p360) {
			p360 m = (p360) obj;
			return this.name.equals(m.name) && this.age == m.age;
		} else {
			return false;
		}
	}
	
	// hashCode() �޼��� ������
	@Override
	public int hashCode() {
		return this.name.hashCode() + age;
	}
	
}
