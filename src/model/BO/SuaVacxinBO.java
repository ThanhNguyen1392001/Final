package model.BO;

import java.sql.SQLException;

import model.DAO.SuaVacxinDAO;

public class SuaVacxinBO {

	public static boolean suaVacxin(String maVacxin, String tenVacxin, int soMui, String moTa, double giaVacxin,
			String tenHangSX) throws SQLException {
		return SuaVacxinDAO.suaVacxin(maVacxin, tenVacxin, soMui, moTa, giaVacxin, tenHangSX);
	}

}
