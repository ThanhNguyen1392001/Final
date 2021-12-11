package model.BO;

import java.sql.SQLException;
import java.util.List;

import model.Bean.Vacxin;
import model.DAO.GetVacxinDAO;

public class GetVacxinBO {

	public static List<Vacxin> getVacxin() throws SQLException {
		return GetVacxinDAO.getVacxin();
	}

}
