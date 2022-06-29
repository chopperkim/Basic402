package chapter08;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		Vehicle vehicle = new Taxi();
		if (vehicle instanceof Bus) {
			Bus bus2 = (Bus) vehicle;
		}
		
		vehicle = new Bus();
		Bus bus = (Bus) vehicle;
		
		driver.drive(new Bus());
		driver.drive(new Taxi());
	}
}
