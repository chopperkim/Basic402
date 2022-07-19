package chapter20.memo;

public class MemoApplication {
	public static void main(String[] args) throws Exception {
		new MemoView().init(new MemoController());
	}
}
