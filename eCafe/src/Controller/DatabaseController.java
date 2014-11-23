package Controller;

import java.sql.*;

public class DatabaseController {
	private String host;
	private String database;
	private String username;
	private String password;
	private Connection con;

	public DatabaseController(String host, String database, String username,
			String password) {
		this.host = host;
		this.database = database;
		this.username = username;
		this.password = password;
	}

	public boolean attemptConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		} catch (Exception e) {
			System.err.println("Driver Registration Failure: " + e.getMessage());
			return false;
		}
		try {
			con = DriverManager.getConnection("jdbc:mysql://" + host + "/"
					+ database + "?user=" + username + "&password=" + password);
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			return false;
		}
		return true;
	}
	
	/**
	 * Executes select statement using given record and table
	 * @param record
	 * @param table
	 * @return True if all goes well
	 */
	public boolean selectFrom(String record, String table, String col) {
		Statement state = null;
		ResultSet set = null;
		try {
			state = con.createStatement();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			return false;
		}
		try {
			set = state.executeQuery("SELECT " + record + " FROM " + table);
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			return false;
		}

		try {
			while(set.next()){
				try {
					System.out.println(set.getString(col));
				} catch (SQLException e) {
					System.err.println(e.getMessage());
				}
			}
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
		
		try {
			set.close();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
		return true;
	}
}
