package ch13;

public class p363 implements Comparable {
	
	// �ʵ�
	String name;
	int age;
	
	// ������
	p363(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// toString() �޼��� ������
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
