package model.BO;

import java.sql.SQLException;

import model.DAO.ThemVacxinDAO;

public class ThemVacxinBO {

	public static boolean themVacxin(String maVacxin, String tenVacxin, int soMui, String moTa, double giaVacxin,
			String tenHangSX) throws SQLException {
		return ThemVacxinDAO.themVacxin(maVacxin, tenVacxin, soMui, moTa, giaVacxin, tenHangSX);
	}

}
