package chapter06.exercise;

public class NewCar {
	private double speed;
	private String color;
	private static final double MAX_SPEED = 200 / 1.6;
	public NewCar() {
	}
	public NewCar(String color) {
		this.color = color;
	}
	public double getSpeed() {
		return mileToKillo(speed);
	}
	public void setSpeed(double speed) {
		this.speed = killoToMile(speed);
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public static double getMaxSpeed() {
		return mileToKillo(MAX_SPEED);
	}
	/**
	 * 
	 * @param speed: 목표속도 or 속도만큼 증감
	 * @return
	 */
	public boolean speedUp(double speed) {
		speed = killoToMile(speed);
		
		if (this.speed + speed < 0 || this.speed + speed > MAX_SPEED) {
			return false;
		}
		this.speed += speed;
		return true;
	}
	private static double killoToMile(double distance) {
		return distance / 1.6;
	}
	private static double mileToKillo(double distance) {
		return distance * 1.6;
	}
	public String toString() {
		return "자동차 속력=" + speed + ", 색상=" + color;
	}
}
