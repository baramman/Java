package ch07;

public class P168 {
	
	public static void main(String[] args) {
		
		P172 stu = new P172("홍길동", 4, "소프트웨어공학");
		
		System.out.println(stu.name);
		System.out.println(stu.grade);
		System.out.println(stu.department);
		
		P172 stu2 = new P172("이순신", 3, "디자인");
		
		System.out.println(stu2.name);
		System.out.println(stu2.grade);
		System.out.println(stu2.department);
	}
}
