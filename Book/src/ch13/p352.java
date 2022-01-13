package ch13;

class Circle extends Shape {
	
	// 필드
	double r;
	
	// 생성자
	Circle() {
		this(1);
	}
	Circle(double r) {
		this.r = r;
	}

	@Override
	double area() {
		return (r * r) * Math.PI;
	}

	@Override
	double length() {
		return (r * 2) * Math.PI;
	}
}

class Rectangle extends Shape {
	
	// 필드
	int w, h;
	
	// 생성자
	Rectangle() {
		this(1, 1);
	}
	Rectangle(int w, int h) {
		this.w = w;
		this.h = h;
	}
	
	// 메서드 재정의(오버라이딩)
	@Override
	double area() {
		return (w * h);
	}
	@Override
	double length() {
		return (w + h) * 2;
	}
}

public class p352 {

}
