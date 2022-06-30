package chapter08.exercise;

public abstract class Book {
	private int number;
	private String title;
	private String author;
	private static int countOfBooks = 1;
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		this.number = countOfBooks++;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	@Override
	public boolean equals(Object obj) {
		Book book = null;
		if (obj instanceof Book) {
			book = (Book) obj;
		}
//		if (this.author.equals(book.author)
//				&& this.title.equals(book.title)) {
//			return true;
//		} else {
//			return false;
//		}
		return this.author.equals(book.author) && this.title.equals(book.title);
	}
	
	public abstract int getLateFee(int lateDays);
	
	@Override
	public String toString() {
		return "제목: " + title + ", 작가: " + author + "(일주일 연체료: " + getLateFee(7) + "원)";
	}
	
}
