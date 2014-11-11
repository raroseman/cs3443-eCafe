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
		} catch (Exception ex) {
			System.err.println("Driver Registration Failure: "
					+ ex.getMessage());
			return false;
		}
		try {
			con = DriverManager.getConnection("jdbc:mysql://" + host + "/"
					+ database + "?user=" + username + "&password=" + password);
		} catch (SQLException ex) {
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
			return false;
		}
		return true;
	}

	public boolean selectFrom(String record, String table) {
		Statement state = null;
		ResultSet set = null;
		try {
			state = con.createStatement();
		} catch (SQLException ex) {
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
			return false;
		}
		try {
			set = state.executeQuery("SELECT " + record + " FROM " + table);
		} catch (SQLException ex) {
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
			return false;
		}

		System.out.println(set.toString());
		
		return true;
	}
}
