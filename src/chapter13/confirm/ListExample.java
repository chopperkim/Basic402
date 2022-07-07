package chapter13.confirm;

import java.util.List;

public class ListExample {
	public static void main(String[] args) {
		BoardDAO dao = new BoardDAO();
		List<Board> list = dao.getBoardList();
		for (Board board : list) {
			System.out.println(board.getTitle() + "-" + board.getContent());
		}
	}
}
