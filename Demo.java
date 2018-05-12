package sqldemo;

public class Demo {
	public static void main(String args[]) throws Exception {
		try {
			MySqlConnect.getConnection();
		} catch (Exception e) {
			System.out.println(e);
		}
		PersonDAO personDao = new PersonDAO();
		personDao.insert("chaitanya", 10);
		personDao.update("Manda", 35, 10001);
		personDao.getAll();
	}
}
