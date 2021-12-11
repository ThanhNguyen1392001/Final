package model.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Bean.Vacxin;
import utils.DatabaseConnection;

public class GetVacxinTheoMaVacxinDAO {

	public static Vacxin getVacxinTheoMaVacxin(String maVacxin) throws SQLException {
		Vacxin v = null;
		// Create and execute query
		Connection con = DatabaseConnection.getConnection();
		Statement s = con.createStatement();
		String query = "select * from vacxin where MaVacxin = '" + maVacxin + "'";
		ResultSet rs = s.executeQuery(query);

		// get data
		if (rs.next()) {
			String tenVacxin = rs.getString("TenVacxin");
			int soMui = Integer.parseInt(rs.getString("SoMui"));
			String moTa = rs.getString("MoTa");
			double giaVacxin = Double.parseDouble(rs.getString("GiaVacxin"));
			String tenHangSX = rs.getString("TenHangSX");
			v = new Vacxin(maVacxin, tenVacxin, soMui, moTa, giaVacxin, tenHangSX);
		}
		return v;
	}

}
