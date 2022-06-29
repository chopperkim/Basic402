package chapter08;

public class DaoExample {
	public static void main(String[] args) {
		dbWork(new OracleDAO());
		dbWork(new MySqlDAO());
	}
	private static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
}
