package model.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Bean.Vacxin;
import utils.DatabaseConnection;

public class GetVacxinDAO {

	public static List<Vacxin> getVacxin() throws SQLException {
		List<Vacxin> vacxins = new ArrayList<Vacxin>();
		Connection con = DatabaseConnection.getConnection();
		Statement s = con.createStatement();
		String query = "Select * from vacxin";
		ResultSet rs = s.executeQuery(query);
		while (rs.next()) {
			String maVacxin = rs.getString("MaVacxin");
			String tenVacxin = rs.getString("TenVacxin");
			int soMui = Integer.parseInt(rs.getString("SoMui"));
			String moTa = rs.getString("MoTa");
			double giaVacxin = Double.parseDouble(rs.getString("GiaVacxin"));
			String tenHangSX = rs.getString("TenHangSX");
			vacxins.add(new Vacxin(maVacxin, tenVacxin, soMui, moTa, giaVacxin, tenHangSX));
		}
		return vacxins;
	}

}
