package chapter07;

public class AnimalExample {
	public static void main(String[] args) {
		Pome pome = new Pome();
		Cat cat = new Cat();
		pome.sound();
		cat.sound();
		
		Animal animal = new Pome();
		animal.sound();
		animal = new Cat();
		animal.sound();
		
		Dog dog = new Dog() {
			@Override
			public void sound() {
				System.out.println("bowbow");
			}
			@Override
			public void eat() {
			}
			@Override
			public void run() {
			}
			@Override
			public void walk() {
			}
		};
		dog.sound();
	}
}








