package model.BO;

import java.sql.SQLException;

import model.Bean.Vacxin;
import model.DAO.GetVacxinTheoMaVacxinDAO;

public class GetVacxinTheoMaVacxinBO {

	public static Vacxin getVacxinTheoMaVacxin(String maVacxin) throws SQLException {
		return GetVacxinTheoMaVacxinDAO.getVacxinTheoMaVacxin(maVacxin);
	}

}