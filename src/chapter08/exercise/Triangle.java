package chapter08.exercise;

public class Triangle extends Shape {
	private double side;

	public Triangle(double side) {
		this.side = side;
	}
	
	@Override
	public double area() {
		return Math.sqrt(3) / 4.0 * side * side;
	}
	@Override
	public double perimeter() {
		return side * 3;
	}
	@Override
	public String toString() {
		return String.format("도형의 종류: 정삼각형, 둘레: %.2f㎝, 넓이: %.2f㎠", perimeter(), area());
//		return "도형의 종류: 정삼각형, 둘레: " + perimeter() + "㎝, 넓이: " + area() + "㎠";
	}

}
