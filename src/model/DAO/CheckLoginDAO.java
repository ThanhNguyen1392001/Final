package model.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Bean.Account;
import utils.DatabaseConnection;

public class CheckLoginDAO {
	private CheckLoginDAO() {
	}

	public static Account checkLogin(String username, String password) throws SQLException {
		Account a = null;

		Connection con = DatabaseConnection.getConnection();
		Statement s = con.createStatement();
		String query = "Select * from account where username = '" + username + "' and password = '" + password + "'";

		ResultSet rs = s.executeQuery(query);
		while (rs.next()) {
			String usn = rs.getString("username");
			String pwd = rs.getString("password");
			a = new Account(usn, pwd);
		}

		return a;
	}
}
