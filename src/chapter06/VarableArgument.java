package chapter06;

public class VarableArgument {
	public static void main(String[] args) {
		VarableArgument argument = new VarableArgument();
		argument.run();
	}
	void sum(int a) {
		if (a < 10) {
			return;
		}
		System.out.println(a + 1);
	}
	int sum(int a, int b) {
		return a + b;
	}
	
	int sum(int... array) {
		int s = 0;
		for (int i = 0; i < array.length; i++) {
			s += array[i];
		}
		return s;
	}
	
	void run() {
		sum(1);
		int sum = sum(new int[] {10, 20, 30});
		System.out.println(sum);
	}
}
