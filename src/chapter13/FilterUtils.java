package chapter13;

import java.util.ArrayList;
import java.util.List;

public class FilterUtils {
	public List<Apple> filter(List<Apple> list, ApplePredicate predicate) {
		List<Apple> redApples = new ArrayList<>();
		for (Apple apple : list) {
			if (predicate.test(apple)) {
				redApples.add(apple);
			}
		}
		return list;
	}
}
