package chapter09;

import chapter08.Searchable;

public class SearchableExample {
	public static void main(String[] args) {
		Searchable s = new Searchable() {
			public void search(String url) {
				System.out.println(url);
			}
		};
		s.search("홍길동");
	}
}
