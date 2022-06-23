package chapter06;

public class FinalExample {
	
	final String STR;
	
	public FinalExample(String str) {
		this.STR = str;
	}
	
	public static void main(String[] args) {
		FinalExample example = new FinalExample("a");
		System.out.println(example.STR);
		FinalExample example1 = new FinalExample("b");
		System.out.println(example1.STR);
	}
	
}
