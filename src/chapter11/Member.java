package chapter11;

import java.util.Objects;

// Value Object (데이터를 저장하는 객체)
public class Member {
	private String id;
	private String name;
	private int mileage;
	public Member(String id, String name, int mileage) {
		this.id = id;
		this.name = name;
		this.mileage = mileage;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, mileage, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Member)) {
			return false;
		}
		Member other = (Member) obj;
		return Objects.equals(id, other.id) && mileage == other.mileage && Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return String.format("Member [id=%s, name=%s, mileage=%s]", id, name, mileage);
	}
}








