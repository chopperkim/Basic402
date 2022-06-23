package chapter06.exercise;

public class Car {
	private double speed;
	private String color;
	private static final double MAX_SPEED = 200;
	public Car() {
	}
	public Car(String color) {
		this.color = color;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public static double getMaxSpeed() {
		return MAX_SPEED;
	}
	/**
	 * 
	 * @param speed: 목표속도 or 속도만큼 증감
	 * @return
	 */
	public boolean speedUp(double speed) {
//		if (speed < 0 || speed > MAX_SPEED) {
//			return false;
//		}
//		this.speed = speed;
//		return true;
		if (this.speed + speed < 0 || this.speed + speed > MAX_SPEED) {
			return false;
		}
		this.speed += speed;
		return true;
	}
	public String toString() {
		return "자동차 속력=" + speed + ", 색상=" + color;
	}
	
}
