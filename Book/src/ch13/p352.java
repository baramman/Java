package ch13;

class Circle extends Shape {
	
	// �ʵ�
	double r;
	
	// ������
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
	
	// �ʵ�
	int w, h;
	
	// ������
	Rectangle() {
		this(1, 1);
	}
	Rectangle(int w, int h) {
		this.w = w;
		this.h = h;
	}
	
	// �޼��� ������(�������̵�)
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
