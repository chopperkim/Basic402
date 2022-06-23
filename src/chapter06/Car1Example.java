package chapter06;

public class Car1Example {
	public static void main(String[] args) {
		
		Car1 car = new Car1();
		// 잘못된 속도 변경
		car.setSpeed(-50);
		
		System.out.println(car.getSpeed());
		
		// 속도 변경
		car.setSpeed(60);
		
		System.out.println(car.getSpeed());
		// 멈춤
		if (!car.isStop()) {
			car.setStop(true);
		}
		
		System.out.println(car.getSpeed());
	}
}
