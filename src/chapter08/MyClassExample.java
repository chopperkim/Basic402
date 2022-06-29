package chapter08;

public class MyClassExample {
	public static void main(String[] args) {
		MyClass class1 = new MyClass();
		class1.control.turnOn();
		class1.control.setVolume(5);
		
		MyClass class2 = new MyClass(new Audio());
		
		MyClass class3 = new MyClass();
		class3.methodA();
		
		MyClass class4 = new MyClass(new Audio());
		class4.methodB();
		
		MyClass class5 = new MyClass(new SmartTelevision());
		
		RemoteControl control = new RemoteControl() {
			@Override
			public void turnOn() {
			}
			
			@Override
			public void turnOff() {
			}
			
			@Override
			public void setVolume(int volume) {
			}
		};
		
		MyClass class6 = new MyClass();
		class6.methodC(new Audio());
		
	}
}





