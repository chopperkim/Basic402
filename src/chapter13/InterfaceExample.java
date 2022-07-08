package chapter13;

import java.util.Arrays;
import java.util.List;

public class InterfaceExample {
	public static void main(String[] args) {
		List<Apple> list = Arrays.asList(
			new Apple(1, Color.RED),
			new Apple(2, Color.RED),
			new Apple(3, Color.GREEN),
			new Apple(4, Color.YELLOW),
			new Apple(5, Color.GREEN),
			new Apple(6, Color.GREEN),
			new Apple(7, Color.YELLOW),
			new Apple(8, Color.RED),
			new Apple(9, Color.RED),
			new Apple(10, Color.GREEN),
			new Apple(11, Color.RED)
		);
		
		List<Apple> redApples = FilterUtils.filter(list, apple -> apple.getColor() == Color.RED);
//		redApples.forEach(System.out::println);
		
		
		
		List<Banana> bananaList = Arrays.asList(
			new Banana(1, Color.YELLOW),
			new Banana(2, Color.YELLOW),
			new Banana(3, Color.GREEN),
			new Banana(4, Color.YELLOW),
			new Banana(5, Color.GREEN)
		);
		List<Banana> filteredList = FilterUtils.filter(bananaList, new Predicate<Banana>() {
			@Override
			public boolean test(Banana t) {
				return t.getColor() == Color.YELLOW;
			}
		});
		// Method Reference
		filteredList.forEach(System.out::println);
		
	}
}







