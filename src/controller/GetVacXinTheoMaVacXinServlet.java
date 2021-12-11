package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BO.GetVacxinTheoMaVacxinBO;
import model.Bean.Vacxin;

/**
 * Servlet implementation class GetVacXinTheoMaVacXinServlet
 */
@WebServlet("/GetVacXinTheoMaVacXinServlet")
public class GetVacXinTheoMaVacXinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GetVacXinTheoMaVacXinServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String maVacxin = request.getParameter("maVacxin");
		Vacxin vacxin = null;
		try {
			vacxin = GetVacxinTheoMaVacxinBO.getVacxinTheoMaVacxin(maVacxin);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		request.setAttribute("vacxin", vacxin);
		request.getRequestDispatcher("SuaChiTietVacXin.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
