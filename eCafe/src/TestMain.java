import Controller.DatabaseController;


public class TestMain {

	public static void main(String[] args) {
		DatabaseController db = new DatabaseController("localhost", "unity", "root", "");
		
		db.attemptConnection();
		
		db.selectFrom("*", "Machines");
		
	}

}
