package ch07;

public class P168 {
	
	public static void main(String[] args) {
		
		P172 stu = new P172("ȫ�浿", 4, "����Ʈ�������");
		
		System.out.println(stu.name);
		System.out.println(stu.grade);
		System.out.println(stu.department);
		
		P172 stu2 = new P172("�̼���", 3, "������");
		
		System.out.println(stu2.name);
		System.out.println(stu2.grade);
		System.out.println(stu2.department);
	}
}
