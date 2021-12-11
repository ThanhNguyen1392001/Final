package model.DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import utils.DatabaseConnection;

public class ThemVacxinDAO {

	public static boolean themVacxin(String maVacxin, String tenVacxin, int soMui, String moTa, double giaVacxin,
			String tenHangSX) throws SQLException {
		boolean check = false;
		Connection con = DatabaseConnection.getConnection();
		Statement s = con.createStatement();

		String query = "insert into vacxin values" + "('" + maVacxin + "', '" + tenVacxin + "', " + soMui + ", '"
				+ moTa + "', " + giaVacxin + ", '" + tenHangSX + "')";
		check = s.executeUpdate(query) != 0;
		return check;
	}

}
