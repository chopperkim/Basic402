package chapter13;

import java.util.ArrayList;
import java.util.List;

public class FilterUtils {
	// Generic Method
	public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
		List<T> retList = new ArrayList<>();
		for (T t : list) {
			if (predicate.test(t)) {
				retList.add(t);
			}
		}
		return retList;
	}
}
