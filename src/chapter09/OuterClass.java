package chapter09;

import java.util.jar.Attributes.Name;

class OutsideClass {

}

public class OuterClass {
	private String name;
	
	class MyClass extends Thread {
		@Override
		public void run() {
			super.run();
		}
	}
	
	
	class InnerClass {
		int age;
		
		public InnerClass(int age) {
			this.age = age;
		}

		void innerMethod() {
			int age = 10;
			class LocalClass extends Thread {
				double radius;

				public LocalClass(double radius) {
					this.radius = radius;
				}
				@Override
				public void run() {
					System.out.println(age);
				}
				
			}
			LocalClass localClass = new LocalClass(20.0);
			localClass.radius = 20.0;
		}
	}
}
