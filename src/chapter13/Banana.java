package chapter13;

public class Banana {
	private int groupNo;
	private Color color;
	public Banana(int groupNo, Color color) {
		this.groupNo = groupNo;
		this.color = color;
	}
	public int getGroupNo() {
		return groupNo;
	}
	public void setGroupNo(int groupNo) {
		this.groupNo = groupNo;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return String.format("%s번 바나나: %s", groupNo, color);
	}
	
}
