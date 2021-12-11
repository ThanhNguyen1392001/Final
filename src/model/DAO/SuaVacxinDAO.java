package model.DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import utils.DatabaseConnection;

public class SuaVacxinDAO {

	public static boolean suaVacxin(String maVacxin, String tenVacxin, int soMui, String moTa, double giaVacxin,
			String tenHangSX) throws SQLException {
		boolean check = false;
		Connection con = DatabaseConnection.getConnection();
		Statement s = con.createStatement();

		String query = "update vacxin set TenVacxin = '" + tenVacxin + "', SoMui = " + soMui + ", MoTa = '" + moTa
				+ "', GiaVacxin = " + giaVacxin + ", TenHangSX = '" + tenHangSX + "' where MaVacxin = '" + maVacxin
				+ "'";
		check = s.executeUpdate(query) != 0;
		return check;
	}

}
