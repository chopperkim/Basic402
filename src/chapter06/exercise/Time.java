package chapter06.exercise;

public class Time {
	private int hour;
	private int minute;
	private int second;
	
	public Time() {
	}
	
	public Time(int hour, int minute, int second) {
		if (hour > 0 && hour < 24) {
			this.hour = hour;
		}
		if (minute > 0 && minute < 60) {
			this.minute = minute;
		}
		if (second > 0 && second < 60) {
			this.second = second;
		}
	}
	// 인스턴스의 필드가 어떤 값을 갖고 있는지 확인할 수 있는 메소드
	public String toString() {
		// System.out.printf();와 같음
		// hour + ":" + minute + ":" + second
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
}
