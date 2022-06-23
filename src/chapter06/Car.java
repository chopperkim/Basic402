package chapter06;

public class Car {
	String company;
	String model;
	String color;
	int maxSpeed;
	Car() {
	}
	Car(String model) {
		// String model = "현대자동차";
		this(model, "은색", 250);
		this.company = "BMW";
	}
	Car(String model, String color) {
		this(model, color, 250);
	}
	Car(String model, String color, int maxSpeed) {
		// model = "현대자동차";
		// color = "은색";
		// maxSpeed = 250;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
