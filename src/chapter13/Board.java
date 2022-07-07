package chapter13;

import java.util.Objects;

public class Board {
	private String subject;
	private String contents;
	private String writer;
	public Board(String subject, String contents, String writer) {
		this.subject = subject;
		this.contents = contents;
		this.writer = writer;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(contents, subject, writer);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Board)) {
			return false;
		}
		Board other = (Board) obj;
		return Objects.equals(contents, other.contents) && Objects.equals(subject, other.subject)
				&& Objects.equals(writer, other.writer);
	}

	@Override
	public String toString() {
		return String.format("%s\t%s\t%s", subject, contents, writer);
	}
	
}
