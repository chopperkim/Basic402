package chapter09;

public class AnonymousExample {
	public static void main(String[] args) {
		
		new Anonymous().rc.turnOn();
		
		
		Anonymous anonymous = new Anonymous();
		
		anonymous.rc.turnOn();
		anonymous.rc.turnOff();
		
		anonymous.method();
		
		
		anonymous.method2(new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("SmartTV를 켭니다.");
			}
			@Override
			public void turnOff() {
				System.out.println("SmartTV를 끕니다.");
			}
		});
	}
}
