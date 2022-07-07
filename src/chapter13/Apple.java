package chapter13;

public class Apple {
	private int no;
	private Color color;
	public Apple(int no, Color color) {
		this.no = no;
		this.color = color;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return String.format("%s번 사과: %s", no, color);
	}
}
enum Color {
	RED, GREEN, YELLOW
}